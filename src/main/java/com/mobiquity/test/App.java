package com.mobiquity.test;

import org.omg.IOP.ExceptionDetailMessage;
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
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        String str = null;

        try {
            HelloWorld obj = (HelloWorld) context.getBean("helloBean");
            obj.printHello();
        }catch (Exception e){
            System.out.println(str.toString());
        }
        
    }
}
