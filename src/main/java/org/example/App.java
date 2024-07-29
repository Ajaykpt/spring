package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Dev obj =new Dev();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev)  context.getBean("dev");  //(Dev) typecasted and bean mentioned
        obj.build();
        System.out.println( "Hello World!" );
    }
}
