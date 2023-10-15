package org.example;
import java.util.Scanner;
public class Lab2Exercise4 {
    public static void main(String[] args)
    {
        Scanner reader= new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the first number: ");
        int num1= reader.nextInt();
        System.out.println("Enter the second number: ");
        int num2=reader.nextInt();
        for(int i=num1+1;i<num2;i++)
        {
            sum+=i;
        }
        System.out.println("The sum from "+num1+" to "+num2+" is "+sum);

    }
}
