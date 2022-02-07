package ru.geekbrains.lesson1;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void addFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
