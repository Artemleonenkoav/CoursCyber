package lesson3;

public class Task2 {
    public static void main(String[] args) {

        int[] nums = {10, 12, 3};

        int result = 0;

        for (int m : nums) {

            result += m;

        }

        System.out.println("Значение среднего арифметического равно " + result / nums.length);

    }
}
