package org.example;
import java.util.Scanner;
public class Lab2Exercise5 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        int numfinal=0;
        int num;
        System.out.printf("Input the base number: ");
        num=reader.nextInt();
        System.out.println("Enter the power: ");
        int n;
        n=reader.nextInt();
        for(int i=1;i<=n;i++)
        {
            numfinal=(int)Math.pow(num,i);
        }

        System.out.println("Number "+num+ " to the power of "+n+" is "+numfinal);

    }
}
