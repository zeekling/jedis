package redis.clients.jedis.caching;

import java.util.function.Consumer;

/**
 * @author zeekling
 */
public class DefaultRedisCache<K, V> implements RedisCache<K, V> {

 @Override
 public V get(K key) {
  return null;
 }

 @Override
 public void put(K key, V value) {

 }

 @Override
 public void addInvalidationListener(Consumer<? super K> listener) {

 }

 @Override
 public void close() {

 }
}
