package ru.synergyitacademy.lesson13;

import java.util.Arrays;

public class StudentRunner {

    public static void main(String[] args) {
        Course course = new Course("Компьютерная безопасность");
        for (int i = 1; i < 12; i++) {
            Student student = new Student("Student_" + i);
            course.addStudent(student);
        }

        System.out.println(Arrays.toString(course.getStudents()));
    }
}
