package String;

import java.util.Scanner;

public class Basics {
    public static void sb () {// String builder : - we can modify strings created using string builder
        StringBuilder str = new StringBuilder("harry");
        System.out.println(str.charAt(0));
        str.append('g');
        System.out.println(str);
    }
    
    public static void takeInputAndPrint () {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(" thank you " + name + " for your time");
    }

    public static void preetyPrinting () {
        // print the value of pi but up to 3 values after .
        System.out.printf("formatted value of PI is %.3f %n", Math.PI);

        // print the round of the given number
        float num = 1.345678F;
        System.out.printf("round of the given number is %.2f", num);
    }

    public static void main(String[] args) {
        String name1 = "harry";
        String name2 = "harry";
        String name3 = new String("john");
        String name4 = new String("john");
        System.out.println(name1 == name2); // this is returning true coz the values are stored in string pool
        System.out.println(name3 == name4); // this is returning false coz every time we are creating a new obj


//        takeInputAndPrint();
//        preetyPrinting();
        sb();
    }
}
