package ru.geekbrains.java_level_1;

public class Lesson_2 {

    public static void main(String[] args) {
        System.out.println(LeapYearOrNot(2022));
        System.out.println(CheckingSum(7, 13));
        PositiveOrNegativeCase1(5);
        System.out.println(PositiveOrNegativeCase2(-5));
        PrintLine("Java", 3);
    }

    public static boolean LeapYearOrNot(int year) {
        while (year != 0){
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
        System.out.println("Вы ввели не корректный год");
        return false;
    }

    public static boolean CheckingSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void PositiveOrNegativeCase1(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");
        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    public static boolean PositiveOrNegativeCase2(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void PrintLine(String str, int a) {
        if (a > 0) {
            for (int i = 0; i < a; i++) {
                System.out.println(str);
            }
        } else {
            System.out.println("Вводимое число должно быть больше нуля");
        }
    }
}
