package com.company;

import com.company.planes.OldPlane;
import com.company.planes.Plane;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "bean.xml");

        Plane plane = (Plane) context.getBean("new");
        System.out.println(plane);
        plane.getEngine().fly();

        OldPlane oldPlane = (OldPlane) context.getBean("old");
        System.out.println(oldPlane);
        oldPlane.getOldEngine().flyTry();
    }
}
