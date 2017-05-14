package com.papillon.dc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by papillon on 5/13/2017.
 */
public class DrawingApp {

    public static void main(String[] args){
        ApplicationContext context =
                new FileSystemXmlApplicationContext("C:\\Users\\papillon\\Desktop\\Spring\\springcasei\\ApplicationContext.xml");
        Triangle myBean = (Triangle) context.getBean("triangle");
        myBean.draw();
    }
}
