package com.autowire.AnnotationAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.autowire.config.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext appcontext = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(appcontext);
        
        Subject e = (Subject)appcontext.getBean(Subject.class);
        
        System.out.println(e);
        
        Student stu = (Student)appcontext.getBean(Student.class);
        
        System.out.println(stu);
    }
}
