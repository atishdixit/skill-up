package com.ext.dist.cache.service;

import com.ext.dist.cache.algorithm.PersistenceAlgorithm;
import com.ext.dist.cache.constant.CacheConstant;
import com.ext.dist.cache.algorithm.EvictionAlgorithm;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/**
 * It will hel to handle async call
 * @param <K>
 * @param <V>
 */
public class Cache<K, V> implements CacheConstant {

    private final Map<K, V> map;
    private final EvictionAlgorithm algorithm;
    private final CacheRepository<K, V> cacheRepository;

    public Cache(CacheRepository<K, V> cacheRepository, EvictionAlgorithm algorithm) {
        this.map = new ConcurrentHashMap<>();
        this.cacheRepository = cacheRepository;
        this.algorithm = algorithm;
    }

    /**
     * Retun value based on provided key
     * @param key
     * @return
     */


    public Future<V> get(K key){
        if(map.containsKey(key)){
            return CompletableFuture.completedFuture(map.get(key));
        } else{
            return cacheRepository.get(key);
        }
    }

    /**
     *Return only container and notify that it will return result once complete
     *
     * @param key
     * @param value
     */
    public Future<Void> set(K key, V value){
        if(this.map.containsKey(key)){
            if(this.algorithm.equals(PersistenceAlgorithm.WRITE_THROUGH) ){
                this.cacheRepository.set(key, value).thenAccept($-> this.map.put(key, value));//__ if Writing a lambda expression when parameters are ignored in the body
            }else {
                this.map.put(key, value);
                this.cacheRepository.set(key, value);
                return CompletableFuture.completedFuture(null);
            }
        } else {
            //replacement or redirect
            if(this.map.size()<THRESHOLD_SIZE){

            }
        }
        return null;
    }
}
