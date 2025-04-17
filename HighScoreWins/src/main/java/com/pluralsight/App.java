package com.pluralsight;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.print("What's the first teams name?: ");
        String teamOne = String.valueOf(scanner.next());
       System.out.print("How many points did the" + " " + teamOne + " " + "have?: ");
        int teamOneScore = scanner.nextInt();

       System.out.print("What's the second teams name?: ");
        String teamTwo = String.valueOf(scanner.next());
       System.out.print("How many points did the" + " " + teamTwo + " " + "have?: ");
        int teamTwoScore = scanner.nextInt();

       if (teamOneScore > teamTwoScore) {
           System.out.print("The Winners Are The" + " ");
           System.out.println(teamOne);
       } else if  {
           System.out.print("The Winners Are The" + " ");
           System.out.println(teamTwo);
       } else {
           System.out.print("The Game is a Draw");
       }






    }
}
