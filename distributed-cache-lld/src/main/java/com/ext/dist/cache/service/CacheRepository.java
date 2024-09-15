package com.ext.dist.cache.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class CacheRepository<K,V> {


    public CompletableFuture<V> get(K key){

        return null;
    }

    public CompletableFuture<V> set(K key, V value){
        return null;
    }
}
