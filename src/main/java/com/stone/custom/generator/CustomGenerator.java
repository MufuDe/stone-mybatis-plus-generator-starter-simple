package com.stone.custom.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomGenerator {
    @Autowired
    private GlobalConfig globalConfig;

    @Autowired
    private PackageConfig packageConfig;

    @Autowired
    private StrategyConfig strategyConfig;

    @Autowired
    private TemplateConfig templateConfig;

    @Autowired
    private DataSourceConfig dataSourceConfig;

    public void generateCode() throws Exception {
        //1. 生成器对象
        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfig);
        //2. 配置全局属性
        autoGenerator.global(globalConfig);
        //3. 配置包属性
        autoGenerator.packageInfo(packageConfig);
        //4. 配置策略
        autoGenerator.strategy(strategyConfig);
        //5. 配置模板
        autoGenerator.template(templateConfig);
        //6. 开始生成Code
        autoGenerator.execute();
    }
}
