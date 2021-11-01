package lesson4;

public class Task3 {
    public static void main(String[] args) {
        int i = 5;
        for (i = 0; i <= 20; i++) {
            if (i % 3 == 0)
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println("");
                }
        }
    }
}
// РАБОТАЮ ЕЩЁ НАД ВТОРЫМ ВАРИАНТОМ

//        int random = (int) (Math.random() * 100);
//        if (random / 3) {
//            System.out.printf("Число %число% не является fizz_buzz" , random);
//        } else if (random / 5) {
//            System.out.println("buzz");
//        } else (random / 3 && 5) {
//            System.out.println("FIZZ_BUZZ");




