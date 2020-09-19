package ru.job4j.condition;

public class Cinema {
    //4.1.0. Оператор if с блоком else [#362337]
    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    //4.3.1. Оператор && [#362343]
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        //4.1.0. Оператор if с блоком else [#362337]
        Cinema.access(21);
        Cinema.access(16);

        //4.3.1. Оператор && [#362343]
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);

    }
}
