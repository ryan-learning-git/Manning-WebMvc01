package com.ryan.webmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected String[] getServletMappings(){
        return new String[] { "/" }; //this means handle all requests
    }

    @Override
    protected Class<?>[] getRootConfigClasses(){
        return new Class<?>[] { RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class<?>[] { WebConfig.class };
    }


}
