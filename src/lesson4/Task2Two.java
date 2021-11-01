package lesson4;

import java.util.Scanner;

public class Task2Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your AGE ");
        int age = sc.nextInt();
        System.out.println("Please write your NAME ");
        sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Please write your SEX ");
        String sex = sc.nextLine();

        System.out.printf(" Hello %s, your age %d and your sex is %s", name, age, sex);

    }
}
