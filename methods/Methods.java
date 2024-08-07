package methods;
import java.util.Arrays;

public class Methods {
    public static void printThreeWords() {

        System.out.println("Задание 1:\nOrange\nBanana\nApple");
    }

    public static void checkSumSign() {
        System.out.print("\nЗадание 2: ");
        int a = 12;
        int b = -41;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.print("\nЗадание 3: ");
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.print("\nЗадание 4: ");
        int a = 711;
        int b = 81;
        if(a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static boolean findSum(int a, int b) {
        return (a + b > 9 & a + b < 21);
    }

    public static void findNumber(int a) {
        System.out.print("\nЗадание 6: ");
        if(a >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean findLessZero(int a) {
        return (a < 0);
    }

    public static void printString(String str, int a) {
        System.out.println("\nЗадание 8:");
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static void yearIsLeap(int year) {
        System.out.print("\nЗадание 9: ");
        if( year % 4 == 0 ) {
            if (year % 400 == 0) {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год невисокосный");
            }
        }
        else {
            System.out.println("Год невисокосный");
        }
    }

    public static int[] zeroToOne() {
        System.out.print("\nЗадание 10: ");
        int[] array = {0, 1, 1, 1, 0, 0, 0, 1, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0) {
                array[i] = 1;
            }
            else{
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] fillMassive() {
        System.out.print("\n\nЗадание 11: ");
        int[] array = new int [100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void changeMassive() {
        System.out.print("\n\nЗадание 12: ");
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        //System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
    }

    public static void squareMassive() {
        System.out.print("\n\nЗадание 13: ");
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < array[0].length; j++) {

                if(i == j || i + j == array.length - 1) {
                    array[i][j] = 1;
                }
                else {
                    array[i][j] = 0;
                }
                System.out.print(array[i][j]);
            }
        }
    }

    public static double[] giveArray(int len, double initialValue) {
        System.out.print("\n\nЗадание 14: ");
        double[] array = new double [len];
        Arrays.fill(array, initialValue);
        return array;
    }

    public static void printArray(int[] array) {
        for (int element: array) {
            System.out.print(element + " ");
        }
    }

    public static void printArray(double[] array) {
        for (double element: array) {
            System.out.print(element + " ");
        }
    }
}