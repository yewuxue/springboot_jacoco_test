package com.xingag.api;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.context.annotation.Bean;

/***
 * 入口文件
 *
 * 欢迎关注公众号：AirPython
 */

//@SpringBootApplication
//public class ApiApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(ApiApplication.class, args);
//    }
//
//    @Bean
//    public TomcatServletWebServerFactory servletContainer(){
//        return new TomcatServletWebServerFactory(8081) ;
//    }
//}



//测试
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApiApplication.class);
    }
}
