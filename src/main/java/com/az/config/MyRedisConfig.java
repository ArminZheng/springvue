package com.az.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

import java.net.UnknownHostException;
import java.time.Duration;

@Configuration
public class MyRedisConfig {

    //@ConditionalOnMissingBean(name = "redisTemplate")
    @Bean
    public RedisTemplate<Object, Object> jsonRedisTemplate(RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Object> redisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        template.setDefaultSerializer(redisSerializer);
        return template;
    }
//
    @Bean
    public RedisCacheManager cacheManager(RedisConnectionFactory factory) {
        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                .entryTtl(Duration.ofDays(1))
                .disableCachingNullValues()
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
        return RedisCacheManager.builder(factory).cacheDefaults(cacheConfiguration).build();
    }
//
////    @Bean
////    RedisCacheManager cacheManager(CacheProperties cacheProperties, CacheManagerCustomizers cacheManagerCustomizers,
////                                   ObjectProvider<RedisCacheConfiguration> redisCacheConfiguration,
////                                   ObjectProvider<RedisCacheManagerBuilderCustomizer> redisCacheManagerBuilderCustomizers,
////                                   RedisConnectionFactory redisConnectionFactory, ResourceLoader resourceLoader) {
////        RedisCacheManagerBuilder builder = RedisCacheManager.builder(redisConnectionFactory).cacheDefaults(
////                determineConfiguration(cacheProperties, redisCacheConfiguration, resourceLoader.getClassLoader()));
////        List<String> cacheNames = cacheProperties.getCacheNames();
////        if (!cacheNames.isEmpty()) {
////            builder.initialCacheNames(new LinkedHashSet<>(cacheNames));
////        }
////        redisCacheManagerBuilderCustomizers.orderedStream().forEach((customizer) -> customizer.customize(builder));
////        return cacheManagerCustomizers.customize(builder.build());
////    }

}
