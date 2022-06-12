package com.stone.autoconfig;

import com.stone.custom.config.*;
import com.stone.custom.generator.CustomGenerator;
import com.stone.custom.properties.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * 自动加载配置类
 */
@Import({
        CustomDataSourceConfig.class,
        CustomGlobalConfig.class,
        CustomPackageConfig.class,
        CustomStrategyConfig.class,
        CustomTemplateConfig.class,
        CustomDataSourceConfigProperties.class,
        CustomGlobalConfigProperties.class,
        CustomPackageConfigProperties.class,
        CustomStrategyConfigProperties.class,
        CustomTemplateConfigProperties.class
})
public class MyBatisPlusGeneratorAutoConfiguration {

    /**
     * 加载自定义生成器到容器
     *
     * @return 自定义生成器对象
     */
    @Bean
    public CustomGenerator customGenerator() {
        return new CustomGenerator();
    }
}
