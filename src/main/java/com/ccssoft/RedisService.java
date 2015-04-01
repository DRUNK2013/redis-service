package com.ccssoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * RedisService
 *
 */

public class RedisService {
	private ApplicationContext ac;
	private RedisTemplate<String, String> redisTemplate;
	ValueOperations<String, String> valueOpt;

	@SuppressWarnings("unchecked")
	public RedisService() {
		ac = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");
		redisTemplate = ac.getBean("redisTemplate", RedisTemplate.class);
		valueOpt = redisTemplate.opsForValue();
	}

	public boolean set(String key, String value) {
		valueOpt.set(key, value);
		return true;
	}
	
	public String get(String key){
		return valueOpt.get(key);
	}
}
