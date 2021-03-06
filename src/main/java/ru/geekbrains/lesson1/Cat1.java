package ru.geekbrains.lesson1;

public class Cat1 {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat1(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (!satiety && plate.decreaseFood(appetite)) {
            satiety = true;
        }
    }

    public String printSatiety() {
        if (satiety) {
            return name + " наелся";
        } else  {
            return  name + " голоден";
        }
    }
}
