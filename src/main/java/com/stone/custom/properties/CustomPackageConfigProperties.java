package com.stone.custom.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 包配置对象属性封装类
 */
@Component
@ConfigurationProperties(prefix = "stone.package")
public class CustomPackageConfigProperties {
    /**
     * 指定父包名。如果为空，将下面子包名必须写全部，否则就只需写子包名
     */
    private String parent = "com.baomidou";

    /**
     * 指定父包模块名称
     */
    private String moduleName = "";

    /**
     * 指定实体包名
     */
    private String entity = "entity";

    /**
     * 指定service接口包名
     */
    private String service = "service";

    /**
     * service实现类包名
     */
    private String serviceImpl = "service.impl";

    /**
     * 指定mapper接口包名
     */
    private String mapper = "mapper";

    /**
     * 指定xml包名
     */
    private String xml = "mapper.xml";

    /**
     * 指定控制器包名
     */
    private String controller = "controller";

    /**
     * 指定自定义文件包名
     */
    private String other = "other";

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getServiceImpl() {
        return serviceImpl;
    }

    public void setServiceImpl(String serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public String getMapper() {
        return mapper;
    }

    public void setMapper(String mapper) {
        this.mapper = mapper;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
