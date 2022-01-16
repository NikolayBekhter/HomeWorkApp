package ru.geekbrains.java_level_1;

public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println(leapYearOrNot(2022));
        System.out.println(checkingSum(8, 7));
        positiveOrNegativeCase1(5);
        System.out.println(positiveOrNegativeCase2(-5));
        printLine("Java", 3);
    }

    public static boolean leapYearOrNot(int year) {
        boolean result = false;
        if (year == 0) {
            System.out.println("Вы ввели не корректный год");
            result = false;
        } else if (year % 400 == 0) {
            result = true;
        } else if (year % 100 == 0) {
            result = false;
        } else if (year % 4 == 0) {
            result = true;
        }
        return result;
    }

    public static boolean checkingSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    public static void positiveOrNegativeCase1(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean positiveOrNegativeCase2(int a) {
        return (a < 0);
    }

    public static void printLine(String str, int a) {
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                System.out.println(str);
            }
        } else {
            System.out.println("Вводимое число должно быть больше нуля");
        }
    }
}
