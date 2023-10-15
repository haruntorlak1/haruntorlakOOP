package org.example;
import java.util.Scanner;
public class Lab2Exercise2 {
    public static void main(String[] args)
    {
      Scanner reader=new Scanner(System.in);
      int sum=0;
      int read;
        for(int i=1; i<=3;i++)
        {
            System.out.println("Enter the "+i+" number: ");
            read=reader.nextInt();
            sum+=read;
        }
        System.out.println("Sum: " + sum);
    }
}
