package lesson3;

public class Task1 {
    public static void main(String[] args) {
        int x = 10, y = 12,  z = 3;
        x += y - x++ * z;
        y /= x + 5 % z;
        z = x++ + y * 5;
        x = y - x++ * z;
        //x = --x – y * 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);

    }

}
