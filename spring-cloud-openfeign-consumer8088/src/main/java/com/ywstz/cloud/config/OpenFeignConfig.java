// package com.ywstz.cloud.config;
//
// import feign.Contract;
// import feign.Logger;
// import feign.Request;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
//
// import java.util.concurrent.TimeUnit;
//
// /**
//  * @author TuoZhou
//  * 全局生效，针对所有的openfeign客户端
//  */
// @Configuration
// public class OpenFeignConfig {
//
//     /**
//      * openfeign日志配置
//      */
//     @Bean
//     public Logger.Level level() {
//         return Logger.Level.FULL;
//     }
//
//     /**
//      * 契约配置，支持原生的注解
//      */
//     // @Bean
//     // public Contract contract() {
//     //     return new Contract.Default();
//     // }
//
//     /**
//      * 连接、请求处理超时配置
//      */
//     @Bean
//     public Request.Options options() {
//         return new Request.Options(3, TimeUnit.SECONDS,3,TimeUnit.SECONDS,false);
//     }
//
// }
