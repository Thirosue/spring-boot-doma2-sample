package com.sample.web.admin;

import org.springframework.context.annotation.Configuration;

import com.sample.web.base.BaseApplicationConfig;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableScheduling
//@EnableCaching // JCacheを有効可する
public class ApplicationConfig extends BaseApplicationConfig {

}
