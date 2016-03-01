package com.patrick;
import java.util.*;
public class Main {

    public static void main(String[] args) {
/*    while (true){ //infinite loop
        System.out.println("Hello");
    }*/
        Scanner s = new Scanner(System.in);
        String input = "y";
        double price;
        double salesTax = 1.07;   //Represents 7% sales tax
        //GIT push test
        while (input.equals("y")) {
            System.out.println("Type in a price");
            price = s.nextFloat();
            System.out.println("The price plus sales tax is $" + (price * salesTax));
            //System.out.println("Do you want to calculate another? Type y to continue");
            input = s.next();
        }
        s.close();  //stop the scanner if we don't need it any more

    }
}
