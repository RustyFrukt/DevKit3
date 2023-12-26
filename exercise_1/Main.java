package ru.geekbrains.seminar_3.exercise_1;

public class Main {
    public static void main(String[] args){
        System.out.println(Calculator.sum(8, 9.5));          // Сложение

        System.out.println(Calculator.subtract(5, 2.01));     // Вычитание

        System.out.println(Calculator.multiply(13, 0.1));     // Умножение

        System.out.println(Calculator.divide(8.1, 2));       // Деление
        System.out.println(Calculator.divide(3, 0));          // Деление на 0
    }
}
