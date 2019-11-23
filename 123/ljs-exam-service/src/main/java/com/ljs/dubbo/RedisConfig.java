package com.ljs.dubbo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
	@Bean
	public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory factory){
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		//配置连接工厂
		template.setConnectionFactory(factory);

		//使用StringRedisSerializer来序列化和反序列化redis的key值
		template.setKeySerializer(new StringRedisSerializer());
		
		//使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值（默认使用JDK的序列化方式）json
        Jackson2JsonRedisSerializer jacksonSeial = new Jackson2JsonRedisSerializer(Object.class);
        
        //值采用json序列化
        template.setValueSerializer(jacksonSeial);
        
		return template;
	}

}
