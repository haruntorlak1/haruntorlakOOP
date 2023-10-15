package org.example;

public class Lab2Exercise7 {
    private static void printStars(int broj){
        String star="*";
        System.out.println(star.repeat(broj));

    }
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

    }
}