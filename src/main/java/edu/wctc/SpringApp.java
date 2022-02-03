package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "edu.wctc")
public class SpringApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SpringApp.class);
        context.refresh();

        ((HelperClass)context.getBean("helperClass")).process();
    }


}
