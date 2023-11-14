package com.example.randomapi.redis;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

//@Configuration
public class RedisConfig {
//    @Value("${spring.redis.host}")
//    String redisHost;
//
//    @Bean
//    public RedissonClient redissonClient(){
//        System.err.println("=======> SET REDIS CONFIG");
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://" + redisHost);
//        return Redisson.create();
//    }@Value("${spring.redis.host}")
//    String redisHost;
//
//    @Bean
//    public RedissonClient redissonClient(){
//        System.err.println("=======> SET REDIS CONFIG");
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://" + redisHost);
//        return Redisson.create();
//    }


}
