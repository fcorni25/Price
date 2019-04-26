package com.decathlon.Price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;

@EnableCaching
@SpringBootApplication
public class PriceApplication {

    @Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("price");
    }
    
	public static void main(String[] args) {
		SpringApplication.run(PriceApplication.class, args);
	}

}