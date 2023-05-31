package com.example.boot.init

import com.example.boot.config.RootConfig
import com.example.boot.config.WebConfig
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer

class WebInitializer : AbstractAnnotationConfigDispatcherServletInitializer() {
    override fun getServletMappings(): Array<String> = arrayOf("/")

    override fun getRootConfigClasses(): Array<Class<*>> = arrayOf(RootConfig::class.java)

    override fun getServletConfigClasses(): Array<Class<*>> = arrayOf(WebConfig::class.java)
}