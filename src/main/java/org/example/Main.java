package org.example;

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
        }
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
        private static boolean isSumBetween10And20(int a, int b){
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }

    }
    private static boolean isPositive(int x){
        if (x >= 0){
            return true;
        } else {
            return false;
        }
    }
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        int count = 0;
        while (repeat != count){
            System.out.print(source);
            count++;
        }
    }
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
       if (year % 4 == 0 && year % 100 !=0 && year % 400 != 0){
           return true;
       }
           else {
               return false;
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
