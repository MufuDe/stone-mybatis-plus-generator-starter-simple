package com.stone.custom.config;

import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.stone.custom.properties.CustomGlobalConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 管理全局配置对象
 */
@Component
public class CustomGlobalConfig {

    @Autowired
    private CustomGlobalConfigProperties customGlobalConfigProperties;

    @Bean
    public GlobalConfig globalConfig() {
        //1. 获取全局配置建造者对象
        GlobalConfig.Builder builder = new GlobalConfig.Builder();
        //2. 禁止打开输出目录
        if (customGlobalConfigProperties.isDisableOpenDir()) {
            builder = builder.disableOpenDir();
        }
        //3. 开启 swagger 模式
        if (customGlobalConfigProperties.isEnableSwagger()) {
            builder = builder.enableSwagger();
        }
        //4. 其他
        GlobalConfig globalConfig = builder
                .outputDir(customGlobalConfigProperties.getOutputDir())
                .author(customGlobalConfigProperties.getAuthor())
                .build();
        //5. 返回全局配置
        return globalConfig;
    }
}
