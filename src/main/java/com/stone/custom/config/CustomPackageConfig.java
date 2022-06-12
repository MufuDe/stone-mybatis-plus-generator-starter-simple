package com.stone.custom.config;

import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.stone.custom.properties.CustomPackageConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 管理包配置对象
 */
@Component
public class CustomPackageConfig {

    @Autowired
    private CustomPackageConfigProperties customPackageConfigProperties;

    @Bean
    public PackageConfig packageConfig() {
        //1. 获取包相关的配置项的建造者
        PackageConfig.Builder builder = new PackageConfig.Builder();
        PackageConfig packageConfig = builder
                //1.1 指定父包名
                .parent(customPackageConfigProperties.getParent())
                //1.2 指定模块名称
                .moduleName(customPackageConfigProperties.getModuleName())
                //1.3 指定实体包名
                .entity(customPackageConfigProperties.getEntity())
                //1.4 指定service接口包名
                .service(customPackageConfigProperties.getService())
                //1.5 service实现类包名
                .serviceImpl(customPackageConfigProperties.getServiceImpl())
                //1.6 指定mapper接口包名
                .mapper(customPackageConfigProperties.getMapper())
                //1.7 指定xml包名
                .xml(customPackageConfigProperties.getXml())
                //1.8 指定控制器包名
                .controller(customPackageConfigProperties.getController())
                //1.9 指定自定义文件包名
                .other(customPackageConfigProperties.getOther())
                .build();
        //2. 返回包相关的配置项
        return packageConfig;
    }
}