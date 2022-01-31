package ru.geekbrains.lesson1;

public class Animal {

    public String name;
    static int count;

    public Animal() {
        /*или можно здесь, без метода countingCreatedObjects() использовать count++
        как правильнее, можно комметарий? Если конечно вообще это правильный подход*/
        countingCreatedObjects();
    }

    private void countingCreatedObjects() {
        count++;
    }

    public void run(int run) {}

    public void swim(int swim) {}
}
