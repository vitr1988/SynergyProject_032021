package ru.synergyitacademy.lesson13;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ClassRunner {
    public static void main(String[] args) throws Exception {
        Class<ClassRunner> clazz = ClassRunner.class;
        Class<ClassRunner> objectClazz = (Class<ClassRunner>) new ClassRunner().getClass();

        Class<Student> studentClass = Student.class;

        System.out.println("В классе Student представлены конструкторы:" + Arrays.toString(studentClass.getConstructors()));
        System.out.println("В классе Student представлены поля:" + Arrays.toString(studentClass.getFields()));
        System.out.println("В классе Student представлены поля:" + Arrays.toString(studentClass.getDeclaredFields()));
        System.out.println("В классе Student представлены методы:" + Arrays.toString(studentClass.getMethods()));
        System.out.println("В классе Student представлены методы:" + Arrays.toString(studentClass.getDeclaredMethods()));

        Student student = studentClass.newInstance();
        System.out.println(student);

        Constructor<Student> constructor = studentClass.getConstructor();
        Student anonymousStudent = constructor.newInstance();
        System.out.println(anonymousStudent);

        Constructor<Student> studentConstructor = studentClass.getConstructor(String.class);
        Student namedStudent = studentConstructor.newInstance("Иванов");
        System.out.println(namedStudent);

        Constructor<Student> student2Constructor = studentClass.getConstructor(String.class, int.class);
        Student named2Student = student2Constructor.newInstance("Иванов", 2004);
        System.out.println(named2Student);

        Method levelUp = studentClass.getMethod("levelUp");
        int enrollYear = (int) levelUp.invoke(named2Student);
        System.out.println(enrollYear);
        System.out.println(named2Student);

        Method test = studentClass.getDeclaredMethod("test");
        levelUp.invoke(named2Student);
        System.out.println(named2Student);

        Field course = studentClass.getDeclaredField("course");
        course.setAccessible(true);
        course.set(named2Student, new Course("Юриспруденция"));
        System.out.println(named2Student);

        Field name = studentClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(named2Student, "Петров");
        System.out.println(named2Student);
    }
}
