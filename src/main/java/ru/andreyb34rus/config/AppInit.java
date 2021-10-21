package ru.andreyb34rus.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * AbstractAnnotationConfigDispatcherServletInitializer имплементирует WebApplicationInitializer, который позволяет
 * избавиться от web.xml
 */
public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    // Добавление конфигурации, в которой инициализируем ViewResolver, для корректного отображения jsp.
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }

    /* Данный метод указывает url, на котором будет базироваться приложение, т.е. все запросы
     * от клиента будут перенаправляться на dispatcher servlet */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}