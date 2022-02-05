package ru.geekbrains.lesson1;

public class Lesson_7 {

    public static  String limiter = "_______________________";
    public static void main(String[] args) {

        Plate plate = new Plate(80);
        Cat[] arrayCats = new Cat[]{
                new Cat("Папа_Кот", 50),
                new Cat("Мама_Кошка", 30),
                new Cat("Коржик", 15),
                new Cat("Компот", 20),
                new Cat("Карамелька", 10),
        };

        System.out.println(plate);
        for(Cat cat: arrayCats) {
            System.out.println(cat.printSatiety());
        }

        limiter();
        for(Cat cat: arrayCats) {
            cat.eat(plate);
            System.out.println(plate);
        }

        limiter();
        for(Cat cat: arrayCats) {
            System.out.println(cat.printSatiety());
        }

        plate.addFood(80);

        limiter();
        for(Cat cat: arrayCats) {
            cat.eat(plate);
            System.out.println(plate);
        }

        limiter();
        for(Cat cat: arrayCats) {
            System.out.println(cat.printSatiety());
        }

    }

    private static void limiter() {
        System.out.println(limiter);
        System.out.println();
    }

}
