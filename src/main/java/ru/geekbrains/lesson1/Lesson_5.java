package ru.geekbrains.lesson1;

public class Lesson_5 {

    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Бехин Николай", "Ведущий СКС", "kolya@mang.ru",
                              "89125435670", 3000, 43);
        personArray[1] = new Person("Клюев Андрей", "Главный СКС", "andrey@mang.ru",
                              "89125435671", 2500, 41);
        personArray[2] = new Person("Ермаков Евгений", "СКС", "evgeniy@mang.ru",
                              "89125435672", 2000, 35);
        personArray[3] = new Person("Семин Юрий", "СКС", "uriy@mang.ru",
                              "89125435673", 2100, 36);
        personArray[4] = new Person("Коваль Семён", "СКС", "semen@mang.ru",
                              "89125435674", 1900, 39);

        for (int i=0; i < personArray.length; i++)
            if (personArray[i].getAge() > 40) personArray[i].print();
    }
}
