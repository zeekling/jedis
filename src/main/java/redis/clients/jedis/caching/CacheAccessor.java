package redis.clients.jedis.caching;

/**
 * @author zeekling
 */
public interface CacheAccessor<K, V> {

 V get(K key);

 void put(K key, V value);

 void evict(K key);

}
