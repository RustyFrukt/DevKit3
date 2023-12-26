package ru.geekbrains.seminar_3.exercise_3;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public Pair(T1 key, T2 value) {
        this.first = key;
        this.second = value;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public String toString(){
        return first + ". " + second + ".";
    }
}
