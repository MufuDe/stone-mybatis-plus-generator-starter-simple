package com.stone.custom.config;

import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.stone.custom.properties.CustomDataSourceConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 管理数据源配置对象
 */
@Component
public class CustomDataSourceConfig {

    @Autowired
    private CustomDataSourceConfigProperties customDataSourceConfigProperties;

    @Bean
    public DataSourceConfig dataSourceConfig() {
        //1. 获取数据库配置的建造者对象
        DataSourceConfig.Builder builder = new DataSourceConfig.Builder(
                //1.1 设置数据库URL
                customDataSourceConfigProperties.getUrl(),
                //1.2 设置用户名
                customDataSourceConfigProperties.getUsername(),
                //1.3 设置登录密码
                customDataSourceConfigProperties.getPassword()
        );
        //2. 返回数据源配置对象
        return builder.build();
    }
}
