package com.stone.custom.config;

import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.stone.custom.properties.CustomTemplateConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CustomTemplateConfig {

    @Autowired
    private CustomTemplateConfigProperties customTemplateConfigProperties;

    @Bean
    public TemplateConfig templateConfig() {
        //1. 获取模板路径配置项的建造者对象
        TemplateConfig.Builder builder = new TemplateConfig.Builder();
        //2. 其他
        TemplateConfig templateConfig = builder
                //3.1 设置实体模板路径
                .entity(customTemplateConfigProperties.getEntity())
                //3.2 设置service模板路径
                .service(customTemplateConfigProperties.getService())
                //3.3 设置serviceImpl模板路径
                .serviceImpl(customTemplateConfigProperties.getServiceImpl())
                //3.4 设置mapper模板路径
                .mapper(customTemplateConfigProperties.getMapper())
                //3.5 设置mapperXml模板路径
                .xml(customTemplateConfigProperties.getXml())
                //3.6 设置控制器模板路径
                .controller(customTemplateConfigProperties.getController())
                .build();
        //4. 返回模板路径配置项配置对象
        return templateConfig;
    }
}