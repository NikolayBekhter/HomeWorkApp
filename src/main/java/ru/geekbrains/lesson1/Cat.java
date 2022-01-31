package ru.geekbrains.lesson1;

public class Cat extends Animal {

    private final int MAX_RUN_LENGTH = 200;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(int length){
        if ((length > 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("Кот " + name + " пробежал " + length + "м.");
        } else {
            System.out.println("Кот " + name + " пробежал только " + MAX_RUN_LENGTH + "м, больше не осилит.");
        }
    }

    @Override
    public void swim(int length){
        System.out.println("Кот " + name + " не поплыл, он не любит плавать.");
    }
}
