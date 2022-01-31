package ru.geekbrains.lesson1;

import static ru.geekbrains.lesson1.Animal.count;

public class Lesson_6 {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog("Дружок");
        Animal cat = new Cat("Том");
        dog.run(400);
        dog.swim(5);
        cat.run(200);
        cat.swim(2);
        System.out.println("Нами было создано " + count + " животных.");
    }
}
