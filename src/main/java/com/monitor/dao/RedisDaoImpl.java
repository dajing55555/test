//package com.monitor.dao;
//
//import javax.annotation.Resource;
//
//import org.apache.log4j.Logger;
//
//import com.monitor.controller.UserController;
//import com.monitor.utils.JedisUtil;
//
//import redis.clients.jedis.JedisPool;
//
//public class RedisDaoImpl implements RedisDao {
//
//
//	@Resource
//    JedisPool jedisPool;
//
//	private static Logger log = Logger.getLogger(UserController.class);
//
//	public String get(String key) {
//
//		JedisUtil jedisUtil = new JedisUtil(jedisPool);
//        JedisUtil.Strings strings = jedisUtil.new Strings();
//
//        log.info("缓存中获取的值cache: " + strings.get(key));
//
//        return strings.get(key);
//	}
//
//}
