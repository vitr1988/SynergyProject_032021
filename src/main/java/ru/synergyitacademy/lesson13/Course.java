package ru.synergyitacademy.lesson13;

import org.apache.commons.lang3.ArrayUtils;

public class Course {

    private final String name;

    private Student[] students;

    public Course(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (students == null) {
            students = new Student[10];
        }
        int index = ArrayUtils.indexOf(students, student);
        if (index == -1) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    break;
                } else if (i == students.length - 1) {
                    Student[] newStudents = new Student[students.length + 5];
                    System.arraycopy(students, 0, newStudents, 0, students.length - 1);
                    newStudents[students.length] = student;
                    this.students = newStudents;
                    break;
                }
            }
        } else {
            // Noop
        }
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
