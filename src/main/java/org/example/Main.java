package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
        printString("abcd", 5); // abcdabcdabcdabcdabcd
        Scanner in = new Scanner(System.in);
        System.out.println("\nВведите год: ");
        int year = in.nextInt();
        System.out.println(isLeapYear(year));
        System.out.println(Arrays.toString(createArray(5, 0)));
        int[] array = new int[]{0, 1, 0, 1, 1, 1, 0, 0, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(changeArray(array)));
        int[] arraySecond = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arraySecond));
        System.out.println(Arrays.toString(multiplicationArray(arraySecond)));
        matrix(4);

    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean isPositive(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        int count = 0;
        while (repeat != count) {
            System.out.print(source);
            count++;
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        if (year % 4 == 0 && year % 100 != 0 && year % 400 != 0) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    //    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//            * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        return array;
    }

    //2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static int[] multiplicationArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }

        }
        return array;
    }
    //    3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы
    //    единицами (можно только одну из диагоналей, если обе сложно).
    //            * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    // Также заполнить элементы побочной диагонали
    private static void matrix(int length){
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++){
            System.out.println();
            for (int j = 0; j < length; j++){
                if (i == j || j == length - 1 - i){
                    matrix[i][j] = 1;
                }
                else{
                    matrix[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < length; i++) {
            System.out.println();
            for (int j = 0; j < length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
}


//      int a = 2;
//      int b = 15;
//      boolean c = true;
//      boolean d = false;
//      int sum = a + b;
//      if (sum > 10 && sum < 20){
//          System.out.println(c);
//      }
//      else {
//          System.out.println(d);
//      }
//
//    }
