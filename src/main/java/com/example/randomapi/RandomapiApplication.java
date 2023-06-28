package com.example.randomapi;

import com.example.randomapi.redis.RedisConfig;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class RandomapiApplication {
	@Value("${spring.redis.host}")
	String redisHost;

	public static void main(String[] args) {
		Config config = new Config();
		config.useSingleServer().setAddress("redis://" + "localhost:6379");
		RedissonClient redissonClient = Redisson.create(config);
		redissonClient.getBucket("test").set("hello");
		redissonClient.getBucket("test").get();
		System.err.println("=======> GET VALUE: " + redissonClient.getBucket("test").get());
		SpringApplication.run(RandomapiApplication.class, args);
	}

}
