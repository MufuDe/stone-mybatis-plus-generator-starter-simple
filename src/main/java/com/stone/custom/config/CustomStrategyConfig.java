package com.stone.custom.config;

import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.stone.custom.properties.CustomStrategyConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomStrategyConfig {

    @Autowired
    private CustomStrategyConfigProperties customStrategyConfigProperties;

    @Bean
    public StrategyConfig strategyConfig() {
        //1. 获取策略配置项的建造者
        StrategyConfig.Builder builder = new StrategyConfig.Builder();
        //2. 开启大写命名
        if (customStrategyConfigProperties.isEnableCapitalMode()) {
            builder = builder.enableCapitalMode();
        }
        //3. 开启跳过视图
        if (customStrategyConfigProperties.isEnableSkipView()) {
            builder = builder.enableSkipView();
        }
        //4. 禁用sql过滤
        if (customStrategyConfigProperties.isDisableSqlFilter()) {
            builder = builder.disableSqlFilter();
        }
        //5. 启用 schema
        if (customStrategyConfigProperties.isEnableSchema()) {
            builder = builder.enableSchema();
        }
        //6. 其他
        StrategyConfig strategyConfig = builder
                //6.1 增加过滤表前缀
                .addTablePrefix(new ArrayList<>(customStrategyConfigProperties.getTablePrefix()))
                //6.2 增加过滤表后缀
                .addTableSuffix(new ArrayList<>(customStrategyConfigProperties.getTableSuffix()))
                //6.3 增加过滤字段前缀
                .addFieldPrefix(new ArrayList<>(customStrategyConfigProperties.getFieldPrefix()))
                //6.4 增加过滤字段后缀
                .addFieldSuffix(new ArrayList<>(customStrategyConfigProperties.getFieldSuffix()))
                //6.5 增加包含的表名
                .addInclude(new ArrayList<>(customStrategyConfigProperties.getInclude()))
                //6.6 增加排除表
                .addExclude(new ArrayList<>(customStrategyConfigProperties.getExclude()))
                .build();
        //7. 返回 策略配置项 对象
        return strategyConfig;
    }
}