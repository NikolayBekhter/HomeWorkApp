package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        String orange = "Orange";
        String banana = "Banana";
        String apple = "Apple";
        System.out.println(orange);
        System.out.println(banana);
        System.out.println(apple);
    }

    public static void checkSumSign(){
        int a = 10;
        int b = -15;
        int sum = a + b;
        if (sum >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void  printColor(){
        int value = 50;
        if(value <= 0){
            System.out.println("красный");
        } else if (value > 100){
            System.out.println("зеленый");
        } else {
            System.out.println("желтый");
        }
    }

    public static void compareNumbers(){
        int a = 10;
        int b = 15;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
