package com.gxq.learn.spring.bean.factory.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;  

public class UserNamespaceHandler extends NamespaceHandlerSupport {  
    public void init() {  
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());  
    }  
}
