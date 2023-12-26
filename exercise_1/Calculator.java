package ru.geekbrains.seminar_3.exercise_1;

public class Calculator {


    public static <T extends Number> double sum(T num1, T num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double subtract(T num1, T num2){
        return num1.doubleValue() - num2.doubleValue();
    }
    public static <T extends Number> double multiply(T num1, T num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double divide(T num1, T num2){
        if (num2.doubleValue() == 0){
            throw new ArithmeticException("Ошибка, деление на 0");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
}
