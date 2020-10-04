package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Petrov Petr Petrovich");
        student.setGroup("history");
        student.setImmatriculationDate("01.10.2020");

        System.out.println(student.getName() + " starts learning " + student.getGroup() + " on " + student.getImmatriculationDate());
    }
}
