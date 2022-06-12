package com.stone.custom.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 全局配置对象属性封装类
 */
@Component
@ConfigurationProperties(prefix = "stone.global")
public class CustomGlobalConfigProperties {
    /**
     * .java 文件的存放目录后缀
     */
    private final String OUTPUT_DIR_FOR_JAVA_SUFFIX = "/src/main/java";

    /**
     * .java 文件的存放位置
     */
    private String outputDir = System.getProperty("user.dir") + OUTPUT_DIR_FOR_JAVA_SUFFIX;

    /**
     * 是否打开输出目录
     */
    private boolean disableOpenDir = false;

    /**
     * 作者
     */
    private String author = "作者";

    /**
     * 开启 swagger 模式（默认 false 与 springdoc 不可同时使用）
     */
    private boolean enableSwagger = false;

    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public boolean isDisableOpenDir() {
        return disableOpenDir;
    }

    public void setDisableOpenDir(boolean disableOpenDir) {
        this.disableOpenDir = disableOpenDir;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isEnableSwagger() {
        return enableSwagger;
    }

    public void setEnableSwagger(boolean enableSwagger) {
        this.enableSwagger = enableSwagger;
    }
}
