package ru.geekbrains.lesson1;

public class Dog extends Animal {

    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int length) {
        if ((length > 0) && (length <= MAX_RUN_LENGTH)) {
            System.out.println("Пёс " + name + " пробежал " + length + "м.");
        } else {
            System.out.println("Пёс " + name + " пробежал только " + MAX_RUN_LENGTH + "м, больше не в силах.");
        }
    }

    @Override
    public void swim(int length){
        if ((length > 0) && (length < MAX_SWIM_LENGTH)) {
            System.out.println("Пёс " + name + " проплыл " + length + "м.");
        } else {
            System.out.println("Пёс " + name + " не поплыл, он не может плавать больше " + MAX_SWIM_LENGTH + "м.");
        }
    }
}
