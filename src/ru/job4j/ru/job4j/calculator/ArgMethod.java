package ru.job4j.ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        //закоментил неправильные строки кода, чтобы программа могла скомпилироваться
        //ArgMethod.hello();
        //ArgMethod.hello(name, age);
        //ArgMethod.hello(age);
        //ArgMethod.hello(name, name, name);

        ArgMethod.hello(name);
    }
}
