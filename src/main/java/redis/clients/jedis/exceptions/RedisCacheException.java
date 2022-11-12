package redis.clients.jedis.exceptions;

/**
 * @author zeekling
 */
public class RedisCacheException extends RuntimeException {

    public RedisCacheException(String msg) {
        super(msg);
    }

}
