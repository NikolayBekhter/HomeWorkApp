package ru.geekbrains.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Lesson_4 {

    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_Y = 'Y';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (checkWin1(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn(DOT_O);
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект №1");
                break;
            }
            if (checkWin1(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект №1");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            //добавлен еще один игрок - второй компьютер
//            aiTurn(DOT_Y);
//            printMap();
//            if (checkWin(DOT_Y)) {
//                System.out.println("Победил Искуственный Интеллект №2");
//                break;
//            }
//            if (checkWin1(DOT_Y)) {
//                System.out.println("Победил Искуственный Интеллект №2");
//                break;
//            }
//            if (isMapFull()) {
//                System.out.println("Ничья");
//                break;
//            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn(char player) {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
            //проверка позиций человека по горизонтали
            if (map[0][0] == DOT_X && map[0][1] == DOT_X && map[0][2] == DOT_EMPTY) { x = 2; y = 0; }
            if (map[0][1] == DOT_X && map[0][2] == DOT_X && map[0][0] == DOT_EMPTY) { x = 0; y = 0; }
            if (map[0][0] == DOT_X && map[0][2] == DOT_X && map[0][1] == DOT_EMPTY) { x = 1; y = 0; }
            if (map[1][0] == DOT_X && map[1][1] == DOT_X && map[1][2] == DOT_EMPTY) { x = 2; y = 1; }
            if (map[1][1] == DOT_X && map[1][2] == DOT_X && map[1][0] == DOT_EMPTY) { x = 0; y = 1; }
            if (map[1][0] == DOT_X && map[1][2] == DOT_X && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            if (map[2][0] == DOT_X && map[2][1] == DOT_X && map[2][2] == DOT_EMPTY) { x = 2; y = 2; }
            if (map[2][1] == DOT_X && map[2][2] == DOT_X && map[2][0] == DOT_EMPTY) { x = 0; y = 2; }
            if (map[2][0] == DOT_X && map[2][2] == DOT_X && map[2][1] == DOT_EMPTY) { x = 1; y = 2; }
            //проверка позиций человека по вертикали
            if (map[0][0] == DOT_X && map[1][0] == DOT_X && map[2][0] == DOT_EMPTY) { x = 0; y = 2; }
            if (map[1][0] == DOT_X && map[2][0] == DOT_X && map[0][0] == DOT_EMPTY) { x = 0; y = 0; }
            if (map[0][0] == DOT_X && map[2][0] == DOT_X && map[1][0] == DOT_EMPTY) { x = 0; y = 1; }
            if (map[0][1] == DOT_X && map[1][1] == DOT_X && map[2][1] == DOT_EMPTY) { x = 1; y = 2; }
            if (map[1][1] == DOT_X && map[2][1] == DOT_X && map[0][1] == DOT_EMPTY) { x = 1; y = 0; }
            if (map[0][1] == DOT_X && map[2][1] == DOT_X && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            if (map[0][2] == DOT_X && map[1][2] == DOT_X && map[2][2] == DOT_EMPTY) { x = 2; y = 2; }
            if (map[1][2] == DOT_X && map[2][2] == DOT_X && map[0][2] == DOT_EMPTY) { x = 2; y = 0; }
            if (map[0][2] == DOT_X && map[2][2] == DOT_X && map[1][2] == DOT_EMPTY) { x = 2; y = 1; }
            //проверка позиций человека по диагоналям
            if (map[0][0] == DOT_X && map[1][1] == DOT_X && map[2][2] == DOT_EMPTY) { x = 2; y = 2; }
            if (map[1][1] == DOT_X && map[2][2] == DOT_X && map[0][0] == DOT_EMPTY) { x = 0; y = 0; }
            if (map[0][0] == DOT_X && map[2][2] == DOT_X && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            if (map[2][0] == DOT_X && map[1][1] == DOT_X && map[0][2] == DOT_EMPTY) { x = 2; y = 0; }
            if (map[1][1] == DOT_X && map[0][2] == DOT_X && map[2][0] == DOT_EMPTY) { x = 0; y = 2; }
            if (map[2][0] == DOT_X && map[0][2] == DOT_X && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            //проверка позиций компьютера по горизонтали чтобы выиграть
            if (map[0][0] == DOT_O && map[0][1] == DOT_O && map[0][2] == DOT_EMPTY) { x = 2; y = 0; }
            if (map[0][1] == DOT_O && map[0][2] == DOT_O && map[0][0] == DOT_EMPTY) { x = 0; y = 0; }
            if (map[0][0] == DOT_O && map[0][2] == DOT_O && map[0][1] == DOT_EMPTY) { x = 1; y = 0; }
            if (map[1][0] == DOT_O && map[1][1] == DOT_O && map[1][2] == DOT_EMPTY) { x = 2; y = 1; }
            if (map[1][1] == DOT_O && map[1][2] == DOT_O && map[1][0] == DOT_EMPTY) { x = 0; y = 1; }
            if (map[1][0] == DOT_O && map[1][2] == DOT_O && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            if (map[2][0] == DOT_O && map[2][1] == DOT_O && map[2][2] == DOT_EMPTY) { x = 2; y = 2; }
            if (map[2][1] == DOT_O && map[2][2] == DOT_O && map[2][0] == DOT_EMPTY) { x = 0; y = 2; }
            if (map[2][0] == DOT_O && map[2][2] == DOT_O && map[2][1] == DOT_EMPTY) { x = 1; y = 2; }
            //проверка позиций компьютера по вертикали чтобы выиграть
            if (map[0][0] == DOT_O && map[1][0] == DOT_O && map[2][0] == DOT_EMPTY) { x = 0; y = 2; }
            if (map[1][0] == DOT_O && map[2][0] == DOT_O && map[0][0] == DOT_EMPTY) { x = 0; y = 0; }
            if (map[0][0] == DOT_O && map[2][0] == DOT_O && map[1][0] == DOT_EMPTY) { x = 0; y = 1; }
            if (map[0][1] == DOT_O && map[1][1] == DOT_O && map[2][1] == DOT_EMPTY) { x = 1; y = 2; }
            if (map[1][1] == DOT_O && map[2][1] == DOT_O && map[0][1] == DOT_EMPTY) { x = 1; y = 0; }
            if (map[0][1] == DOT_O && map[2][1] == DOT_O && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            if (map[0][2] == DOT_O && map[1][2] == DOT_O && map[2][2] == DOT_EMPTY) { x = 2; y = 2; }
            if (map[1][2] == DOT_O && map[2][2] == DOT_O && map[0][2] == DOT_EMPTY) { x = 2; y = 0; }
            if (map[0][2] == DOT_O && map[2][2] == DOT_O && map[1][2] == DOT_EMPTY) { x = 2; y = 1; }
            //проверка позиций компьютера по диагоналям чтобы выиграть
            if (map[0][0] == DOT_O && map[1][1] == DOT_O && map[2][2] == DOT_EMPTY) { x = 2; y = 2; }
            if (map[1][1] == DOT_O && map[2][2] == DOT_O && map[0][0] == DOT_EMPTY) { x = 0; y = 0; }
            if (map[0][0] == DOT_O && map[2][2] == DOT_O && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
            if (map[2][0] == DOT_O && map[1][1] == DOT_O && map[0][2] == DOT_EMPTY) { x = 2; y = 0; }
            if (map[1][1] == DOT_O && map[0][2] == DOT_O && map[2][0] == DOT_EMPTY) { x = 0; y = 2; }
            if (map[2][0] == DOT_O && map[0][2] == DOT_O && map[1][1] == DOT_EMPTY) { x = 1; y = 1; }
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = player;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean checkWin(char symb) {
        //проверка победы работает, если проверять всю строку или столбец
        //проверяем победителя по вертикали и по горизонтали
        boolean row = true;
        boolean col = true;
        for (int i = 0; i < SIZE; i++) {
            row = true;
            col = true;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != symb) {
                    row = false;
                }
                if (map[j][i] != symb) {
                    col = false;
                }
            }
            if (row || col) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkWin1(char symb) {
        //провека победы работает, если проверять всю диагональ
        //проверяем победителя по диагоналям
        boolean diagonal1 = true;
        boolean diagonal2 = true;
        boolean result = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                int g = SIZE - 1;
                for (int k = 0; k < SIZE; k++) {
                    if (map[g][k] != symb) {
                        diagonal2 = false;
                    }
                    g--;
                    if (i == j) {
                        if (map[i][j] != symb) {
                            diagonal1 = false;
                        }
                    }
                }
            }
            result = (diagonal1 || diagonal2);
        }
        return result;
    }
}
