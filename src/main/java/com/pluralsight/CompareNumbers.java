package com.pluralsight;

public class CompareNumbers {

    //Add main method

    public static void main(String[] args) {
        System.out.println(isEven(30));
        System.out.println(isPositive(50));
    }


    //Introduce boolean method for isEven
public static boolean isEven(int number){
        return number % 2 == 0;
}

    //Introducing boolean method for isPositive
public static boolean isPositive(int number){
        return number > 0;

}
}
