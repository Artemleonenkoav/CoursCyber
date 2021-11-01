package lesson4;

import java.util.Scanner;

public class Тask2IfElseSc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your AGE ");
        int age = sc.nextInt();
        if (age  < 100) {
            System.out.println("You is OK ");
        } else {
            System.out.println("You is NOT ok");

        }


    }
}
