package ru.geekbrains.java_level_1;

import java.util.Arrays;

public class Lesson_3 {

    public static void main(String[] args) {
        invertArray();
        fillingTheArray();
        changeArray();
        drawDiagonals();
        System.out.println(Arrays.toString(oneDimensionalArray(7, 10)));
        minAndMaxElementsArray();
        shiftingArrayValues(-3, 10, 32, 13, 94, 5);
        System.out.println(definingTheBoundary(2, 2, 2, 1, 2, 2, 10, 1));
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void fillingTheArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void drawDiagonals() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
                int g = array.length - 1;
                for (int k = 0; k < array.length; k++) {
                    array[g][k] = 1;
                    g--;
                }
                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[] oneDimensionalArray(int len, int initialValue) {
        int[] arrey = new int[len];
        for (int i = 0; i < len; i++) {
            arrey[i] = initialValue;
        }
        return arrey;
    }

    public static void minAndMaxElementsArray() {
        int[] array = {45, 22, 90, 31, 54};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное значение в заданном массиве = " + min);
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное значение в заданном массиве = " + max);
    }

    public static void shiftingArrayValues(int n, int... array) {

        int temporaryValue = 0;
        if (n >= 0) {
            if (n >= array.length) {
                n = n % array.length;
            }
            for (int i = 0; i < n; i++) {
                temporaryValue = array[0];
                array[0] = array[array.length - 1];
                for (int j = 1; j < array.length - 1; j++) {
                    array[array.length - j] = array[array.length - j - 1];
                }
                array[1] = temporaryValue;
            }
            System.out.println("Значения массива сместились вправо на " + n + " " + Arrays.toString(array));
        } else {
            n *= -1;
            if (n >= array.length) {
                n = n % array.length;
            }
            for (int i = 0; i < n; i++) {
                temporaryValue = array[array.length - 1];
                array[array.length - 1] = array[0];
                for (int j = array.length - 1; j > 1; j--) {
                    array[array.length - j - 1] = array[array.length - j];
                }
                array[array.length - 2] = temporaryValue;
            }
            System.out.println("Значения массива сместились влево на " + n + " " + Arrays.toString(array));
        }


    }

    public static boolean definingTheBoundary(int... array) {
        int i = 0;
        int j = array.length - 1;
        int leftSum = 0;
        int rightSum = 0;
        for (int k = 0; i <= j; k++) {
            if (leftSum < rightSum) {
                leftSum += array[i];
                i++;
            } else if (leftSum > rightSum) {
                rightSum += array[j];
                j--;
            } else if (leftSum == rightSum) {
                leftSum += array[i];
                i++;
            }
        }
        return (leftSum == rightSum);
    }
}
