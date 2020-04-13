package com.monitor.cache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;
import org.apache.log4j.Logger;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;



/**
 * 
 * @描述: 使用第三方内存数据库Redis作为二级缓存
 * @版权: Copyright (c) 2017 
 * @版本: 1.0
 * @创建日期: 2020年4月1日
 */
public class RedisCache implements Cache{

	
	private static Logger log = Logger.getLogger(RedisCache.class);
		
    private static JedisConnectionFactory jedisConnectionFactory;

    private final String id;

    /**
     * The {@code ReadWriteLock}.
     */
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    
    /**
     * 项目启动时，加载该方法，获取加入缓存的SQL配置xml文件，有几个该方法就执行几次。
     * 
     * 
     * @param id
     */
    public RedisCache(final String id) {
    	
        if (id == null) {
            throw new IllegalArgumentException("找不到缓存的方法id。。。");
        }
        log.info("获取到的缓存操作空间是:" + id);
        
        this.id = id;
    }
	
	public void clear() {
		
		RedisConnection connection = null;
		try {
			connection = jedisConnectionFactory.getConnection();
			connection.flushDb();
            connection.flushAll();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (connection != null) {
                connection.close();
            }
		}
	}

	
	public String getId() {
		
		return this.id;
	}

	
	public Object getObject(Object arg0) {
		
		Object result = null;
		RedisConnection connection = null;
        try{
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            result = serializer.deserialize(connection.get(serializer.serialize(arg0)));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            if (connection != null) {
                connection.close();
            }
        }
        return result;
	}

	
	public ReadWriteLock getReadWriteLock() {
		
		return this.readWriteLock;
	}

	
	public int getSize() {
		
		int result = 0;
		RedisConnection connection = null;
        try{
            connection = jedisConnectionFactory.getConnection();
            result = Integer.valueOf(connection.dbSize().toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            if (connection != null) {
                connection.close();
            }
        }
        return result;
	}

	
	public void putObject(Object arg0, Object arg1) {
		
		RedisConnection connection = null;
        try{
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            connection.set(serializer.serialize(arg0), serializer.serialize(arg1));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            if (connection != null) {
                connection.close();
            }
        }
	}

	
	public Object removeObject(Object arg0) {
		
		RedisConnection connection = null;
        Object result = null;
        try{
            connection = jedisConnectionFactory.getConnection();
            RedisSerializer<Object> serializer = new JdkSerializationRedisSerializer();
            result =connection.expire(serializer.serialize(arg0), 0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally{
            if (connection != null) {
                connection.close();
            }
        }
        return result;
	}

	public static void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
        RedisCache.jedisConnectionFactory = jedisConnectionFactory;
    }
	
	
}
