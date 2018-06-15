package com.zhang.rabbit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@EnableTransactionManagement
@Import({ServiceConfig.class, MybatisConfig.class})
public class SpringConfig {

}
