package com.stone.custom.properties;

import com.baomidou.mybatisplus.generator.config.ConstVal;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "stone.template")
public class CustomTemplateConfigProperties {
    /**
     * 设置实体模板路径
     */
    private String entity = ConstVal.TEMPLATE_ENTITY_JAVA;

    /**
     * 设置控制器模板路径
     */
    private String controller = ConstVal.TEMPLATE_CONTROLLER;

    /**
     * 设置Mapper模板路径
     */
    private String mapper = ConstVal.TEMPLATE_MAPPER;

    /**
     * 设置MapperXml模板路径
     */
    private String xml = ConstVal.TEMPLATE_XML;

    /**
     * 设置Service模板路径
     */
    private String service = ConstVal.TEMPLATE_SERVICE;

    /**
     * 设置ServiceImpl模板路径
     */
    private String serviceImpl = ConstVal.TEMPLATE_SERVICE_IMPL;

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
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
}
