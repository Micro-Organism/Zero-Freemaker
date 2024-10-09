package com.zero.freemarker.common.config;

import freemarker.template.TemplateModelException;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FreemarkerConfiguration {

    freemarker.template.Configuration configuration;

    @Autowired
    public FreemarkerConfiguration(freemarker.template.Configuration configuration) {
        this.configuration = configuration;
    }

    @PostConstruct
    public void configuration() throws TemplateModelException {
        // add globe variable
        this.configuration.setSharedVariable("app", "Spring Boot");
    }
}