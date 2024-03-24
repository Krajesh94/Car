package com.rajesh.Car;

import java.util.*;

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
        
    	ApplicationContext  context =  new ClassPathXmlApplicationContext("spring.xml");
    	
    	/*Vehicle obj = (Vehicle)context.getBean("Car1");
    	obj.drive();
    	
    	Tyre t = (Tyre) context.getBean("tyre");
    	
    	System.out.println(t);*/
    	
    	Car1 obj =(Car1)context.getBean("Car1");
    	obj.drive();
    }
}
