package org.example;
import java.util.Scanner;
public class Lab2Exercise1 {
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       boolean entered=false;
       String inputpass="haruntorlak";
       while(!entered)
       {
           System.out.println("Input a password");
           String password=input.nextLine();
           if(password.equals(inputpass))
           {
               System.out.println("Correct!");
               entered=true;
           }
           else
           {
               System.out.println("Wrong!");

           }
       }
    }
}
