package redis.clients.jedis.caching;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

/**
 * @author zeekling
 */
public class ClientSideCaching<K, V> {

    private final CacheAccessor<K, V> cacheAccessor;

    private final RedisCache<K, V> redisCache;

    private final List<Consumer<K>> invalidationListeners = new CopyOnWriteArrayList<>();

    private ClientSideCaching(CacheAccessor<K, V> cacheAccessor, RedisCache<K, V> redisCache) {
        this.cacheAccessor = cacheAccessor;
        this.redisCache = redisCache;
    }



}
