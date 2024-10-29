package org.example;

import org.example.classes.Apartment;
import org.example.classes.House;
import org.example.classes.Residential;

public class Main {
    public static void main(String[] args) {

        Residential res1 = new Residential();
        Apartment apt1 = new Apartment();
        House h1 = new House();
        Residential h2 = new House();

//        System.out.println(res1.getAddress());
//        System.out.println(res1.estimateBills());
//        System.out.println(apt1.getAddress());
//        System.out.println(apt1.estimateBills());
//        System.out.println(h1.getAddress());
//        System.out.println(h1.estimateBills());
//        System.out.println(h2.getAddress());
//        System.out.println(h2.estimateBills());

        Residential[] properties = {res1, apt1, h1, h2};
        for (Residential property: properties) {
            System.out.println(property.getAddress());
            System.out.println(property.estimateBills());
        }
    }
}