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
     * Docket��װ�ӿ��ĵ���Ϣ
     * title:����
     * description:������Ϣ
     * contact:������Ϣ
     * apiInfo:ָ�������ĵ��еķ�����Ϣ:�ĵ����⣬�ĵ��������汾������
     * select:
     * apis:����һ�����еĽӿ�����api�ĵ�
     */
    @Bean
    public Docket getDocket() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("��Ŀ�ӿ�˵��")
                .description("���ĵ���ϸ˵������Ŀ��˽ӿڹ淶...")
                .version("v 2.0.1")
                .contact(new Contact("Hoare","www.hoare.com","2391783880@qq.com"));
        ApiInfo apiInfo = apiInfoBuilder.build();

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.pluto.controller"))
                //ֻ��user��ͷ����������api�ĵ�
                //.paths(PathSelectors.regex("/user/"))
                //��������
                .paths(PathSelectors.any())
                .build();

        return docket;
    }
}
