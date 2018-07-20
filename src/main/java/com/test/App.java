package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.entitis.Person;
import com.test.entitis.Player;
import com.test.interfaces.IEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/test/beans/beans.xml");
        
        IEntity entity;
        
        entity = applicationContext.getBean(Player.class);
        entity.toDates();
        
        entity = applicationContext.getBean(Person.class);
        entity.toDates();
        
        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
