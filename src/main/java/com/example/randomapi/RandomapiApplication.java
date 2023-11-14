package com.example.randomapi;

import com.example.randomapi.redis.RedisConfig;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RandomapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomapiApplication.class, args);
	}

}
