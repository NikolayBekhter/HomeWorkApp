package ru.geekbrains.lesson1;

public class Lesson_7 {

    public static  String limiter = "_______________________";
    public static void main(String[] args) {

        Plate plate = new Plate(80);
        Cat1[] arrayCat1s = new Cat1[]{
                new Cat1("Папа_Кот", 50),
                new Cat1("Мама_Кошка", 30),
                new Cat1("Коржик", 15),
                new Cat1("Компот", 20),
                new Cat1("Карамелька", 10),
        };

        System.out.println(plate);
        for(Cat1 cat1 : arrayCat1s) {
            System.out.println(cat1.printSatiety());
        }

        limiter();
        for(Cat1 cat1 : arrayCat1s) {
            cat1.eat(plate);
            System.out.println(plate);
        }

        limiter();
        for(Cat1 cat1 : arrayCat1s) {
            System.out.println(cat1.printSatiety());
        }

        plate.addFood(80);

        limiter();
        for(Cat1 cat1 : arrayCat1s) {
            cat1.eat(plate);
            System.out.println(plate);
        }

        limiter();
        for(Cat1 cat1 : arrayCat1s) {
            System.out.println(cat1.printSatiety());
        }

    }

    private static void limiter() {
        System.out.println(limiter);
        System.out.println();
    }

}
