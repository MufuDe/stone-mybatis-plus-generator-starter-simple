package com.stone.custom.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "stone.datasource")
public class CustomDataSourceConfigProperties {
    /**
     * 驱动连接的URL
     */
    private String url = null;

    /**
     * 数据库连接用户名
     */
    private String username = "root";

    /**
     * 数据库连接密码
     */
    private String password = "root";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
