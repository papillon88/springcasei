package com.papillon.dc;

import com.papillon.dc.beans.Address;
import com.papillon.dc.beans.FruitBasket;
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

        Person p1 = (Person)context.getBean("person");
        Person p2 = (Person)context.getBean("person");
        p1.setTaxId(345);
        System.out.println(p1);
        System.out.println(p2);

        Address address = (Address)context.getBean("address");
        System.out.println(address);

        Address address2 = (Address)context.getBean("address2");
        System.out.println(address2);

        FruitBasket fb = (FruitBasket)context.getBean("fruitbasket");
        System.out.println(fb);

        ((FileSystemXmlApplicationContext)context).close();
    }
}
