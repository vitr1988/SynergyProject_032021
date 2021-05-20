package ru.synergyitacademy.lesson13;

public class Student {

    private final String name;
    private Course course;
    private int educationYear = 1;
    private int enrollYear;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int enrollYear) {
        this.name = name;
        this.enrollYear = enrollYear;
    }

    public Student() {
        this.name = "Anonymous";
    }

    public int levelUp() {
        return ++educationYear;
    }

    private void test() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", educationYear=" + educationYear +
                ", enrollYear=" + enrollYear +
                '}';
    }
}
