package com.pluralsight;

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 1;
        int sum = 9;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println ("Sum = " + sum);



    }

}
