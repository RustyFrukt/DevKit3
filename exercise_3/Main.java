package ru.geekbrains.seminar_3.exercise_3;

public class Main {
    public static void main(String[] args){
        Pair<Integer, String> person1 = new Pair<>(1, "Андронов Виктор");
        Pair<Integer, String> person2 = new Pair<>(2, "Иванов Иван");
        Pair<Integer, String> person3 = new Pair<>(3, "Петров Сергей");
        Pair<Integer, String> person4 = new Pair<>(4, "Сидоров Антон");
        System.out.println("\nСПИСОК СТУДЕНТОВ:");
        System.out.println(person1 + "\n" + person2 + "\n" + person3 + "\n" + person4);
    }
}
