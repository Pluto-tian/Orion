package com.pluto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Hoaer
 * @version 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * Docket封装接口文档信息
     * title:标题
     * description:描述信息
     * contact:作者信息
     * apiInfo:指定生产文档中的封面信息:文档标题，文档描述，版本，作者
     * select:
     * apis:对哪一个包中的接口生产api文档
     */
    @Bean
    public Docket getDocket() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("项目接口说明")
                .description("此文档详细说明了项目后端接口规范...")
                .version("v 2.0.1")
                .contact(new Contact("Hoare","www.hoare.com","2391783880@qq.com"));
        ApiInfo apiInfo = apiInfoBuilder.build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pluto.controller"))
                //只对user开头的请求生产api文档
                //.paths(PathSelectors.regex("/user/"))
                //所有请求
                .paths(PathSelectors.any())
                .build();

        return docket;
    }
}
