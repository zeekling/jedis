package redis.clients.jedis.caching;

/**
 * @author zeekling
 */
public interface RedisCache<K, V> {

    V get(K key);

    void put(K key, V value);

    void addInvalidationListener(java.util.function.Consumer<? super K> listener);

    void close();

}
