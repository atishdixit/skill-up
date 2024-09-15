package com.ext.dist.cache.service;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/**
 * It will hel to handle async call
 * @param <K>
 * @param <V>
 */
public class Cache<K, V> {

    private Map<K, V> storage = new ConcurrentHashMap<>();
    CacheRepository<K, V> cacheRepository;
    /**
     * Retun value based on provided key
     * @param key
     * @return
     */
    public Future<V> get(K key){
        if(storage.containsKey(key)){
            return CompletableFuture.completedFuture(storage.get(key));
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
        if(storage.containsKey(key)){

        } else{

        }
        return null;
    }
}
