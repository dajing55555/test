package com.monitor.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;

/**
 * 
 * @描述: 静态注入中间类
 * @版权: Copyright (c) 2018 
 * @版本: 1.0
 * @创建日期: 2020年4月1日
 */
public class RedisCacheTransfer {
	
	@Autowired
    public void setJedisConnectionFactory(JedisConnectionFactory jedisConnectionFactory) {
		
        RedisCache.setJedisConnectionFactory(jedisConnectionFactory);
    }
	
}
