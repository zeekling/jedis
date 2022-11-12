package redis.clients.jedis.caching;

import redis.clients.jedis.exceptions.RedisCacheException;

import java.util.Map;

/**
 * {@link CacheAccessor implementation for {@link Map}-based cache implementations.}
 *
 * @param <K> type of key
 * @param <V> type of value
 * @author zeekling
 */
public class MapCacheAccessor<K, V> implements CacheAccessor<K, V> {

    public static <K, V> CacheAccessor<K, V> forMap(Map<K, V> map) {
        return new MapCacheAccessor<>(map);
    }

    private final Map<K, V> map;

    MapCacheAccessor(Map<K, V> map) {
        this.map = map;
    }

    @Override
    public V get(K key) {
        if (map == null || map.size() == 0) {
            return null;
        }
        return map.get(key);
    }

    @Override
    public void put(K key, V value) {
        if (map == null) {
            throw new RedisCacheException("cache map is null");
        }
        map.put(key, value);
    }

    @Override
    public void evict(K key) {
        if (map == null) {
            return;
        }
        map.remove(key);
    }
}
