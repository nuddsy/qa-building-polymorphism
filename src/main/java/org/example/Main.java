package org.example;

import org.example.classes.Apartment;
import org.example.classes.House;
import org.example.classes.Residential;

public class Main {
    public static void main(String[] args) {

//        part1();

        nicerFormatPart1();


    }

    private static void nicerFormatPart1() {
        Residential r1 = new Residential('A', 'A', "123 London Way,\n Worcester,\n Worcestershire,\n WR4 2RT");
        Residential r2 = new Residential('F', 'G', "62 West Wallaby Street,\n Wigan,\n Lancashire,\n WN3 7LL");

        Apartment a1 = new Apartment(false, 50, 60, "Ground");
        a1.setEpcRating('B');
        a1.setCouncilTaxBand('C');
        a1.setAddress("10 Downing Street,\n London,\n L1 4SO");

        House h1 = new House("Detached", true, true, 2);
        h1.setEpcRating('A');
        h1.setCouncilTaxBand('F');
        h1.setAddress("Dick n' Dom Bungalow V 2.0,\n Sheffield,\n South Yorkshire,\n S10 1ET");

        Residential[] properties = {r1, r2, a1, h1};

        for (Residential property : properties){
            System.out.printf("The current property address is :\n%s", property.getAddress());
            System.out.printf("\nThe current property bills are :\n%s\n", property.estimateBills());
        }

    }

    private static void part1() {
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