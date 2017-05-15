package com.papillon.dc;

import com.papillon.dc.beans.Address;
import com.papillon.dc.beans.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by papillon on 5/14/2017.
 */
public class App {

    public static void main(String[] args){

        ApplicationContext context =
                new FileSystemXmlApplicationContext("ApplicationContext.xml");

        Person p = (Person)context.getBean("person");
        System.out.println(p);

        Address address = (Address)context.getBean("address");
        System.out.println(address);


        ((FileSystemXmlApplicationContext)context).close();
    }
}
