package lesson9;

public class Task2 {
    public static void main(String[] args) {
        int array[] = new int[]{50, 8, 55, 8, 77, 789, 5, 9};

        //  получения максимального значения
        int max = getMax(array);
        System.out.println("Max число : " + max);

        // получения минимального значения
        int min = getMin(array);
        System.out.println("Min число : " + min);

        // нахождение общей суммы
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Общая сумма всех чисел : " + sum);

        // Не четные элементы

        int n = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] % 2 - 1 == 0) {
                n++;
                sum += array[x];

                System.out.println("Нечетный элемент = " + array[x]);
            }
        }

        System.out.println("Всего нечетных элементов = " + n);

        // Среднеарефметическое число
        int result = 0;

        for (int m : array) {

            result += m;

        }

        System.out.println("Значение среднего арифметического равно " + result / array.length);
    }

    //здесь находим максимум
    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // здесь находим минимум
    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;


    }
}



