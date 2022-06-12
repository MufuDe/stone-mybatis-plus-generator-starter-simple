package com.stone.custom.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * 输出策略配置对象属性封装类
 */
@Component
@ConfigurationProperties(prefix = "stone.strategy")
public class CustomStrategyConfigProperties {
    /**
     * 是否大写命名（默认 false）
     */
    private boolean enableCapitalMode = false;

    /**
     * 是否跳过视图（默认 false）
     */
    private boolean enableSkipView = false;

    /**
     * 过滤表前缀
     * example: addTablePrefix("t_")
     * result: t_simple -> Simple
     */
    private final Set<String> tablePrefix = new HashSet<>();

    /**
     * 过滤表后缀
     * example: addTableSuffix("_0")
     * result: t_simple_0 -> Simple
     */
    private final Set<String> tableSuffix = new HashSet<>();

    /**
     * 过滤字段前缀
     * example: addFieldPrefix("is_")
     * result: is_deleted -> deleted
     */
    private final Set<String> fieldPrefix = new HashSet<>();

    /**
     * 过滤字段后缀
     * example: addFieldSuffix("_flag")
     * result: deleted_flag -> deleted
     */
    private final Set<String> fieldSuffix = new HashSet<>();

    /**
     * 需要包含的表名，允许正则表达式（与exclude二选一配置）<br/>
     * 当{@link #disableSqlFilter}为false时，正则表达式无效.
     */
    private final Set<String> include = new HashSet<>();

    /**
     * 需要排除的表名，允许正则表达式<br/>
     * 当{@link #disableSqlFilter}为false时，正则表达式无效.
     */
    private final Set<String> exclude = new HashSet<>();

    /**
     * 启用sql过滤，语法不能支持使用sql过滤表的话，可以考虑关闭此开关.
     *
     * @since 3.3.1
     */
    private boolean disableSqlFilter = false;

    /**
     * 启用 schema 默认 false
     */
    private boolean enableSchema = false;

    public boolean isEnableCapitalMode() {
        return enableCapitalMode;
    }

    public void setEnableCapitalMode(boolean enableCapitalMode) {
        this.enableCapitalMode = enableCapitalMode;
    }

    public boolean isEnableSkipView() {
        return enableSkipView;
    }

    public void setEnableSkipView(boolean enableSkipView) {
        this.enableSkipView = enableSkipView;
    }

    public Set<String> getTablePrefix() {
        return tablePrefix;
    }

    public Set<String> getTableSuffix() {
        return tableSuffix;
    }

    public Set<String> getFieldPrefix() {
        return fieldPrefix;
    }

    public Set<String> getFieldSuffix() {
        return fieldSuffix;
    }

    public Set<String> getInclude() {
        return include;
    }

    public Set<String> getExclude() {
        return exclude;
    }

    public boolean isDisableSqlFilter() {
        return disableSqlFilter;
    }

    public void setDisableSqlFilter(boolean disableSqlFilter) {
        this.disableSqlFilter = disableSqlFilter;
    }

    public boolean isEnableSchema() {
        return enableSchema;
    }

    public void setEnableSchema(boolean enableSchema) {
        this.enableSchema = enableSchema;
    }
}
