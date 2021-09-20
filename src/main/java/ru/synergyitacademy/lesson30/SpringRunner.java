package ru.synergyitacademy.lesson30;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        final Calculator calculator = (Calculator) context.getBean("calculator");
//        final Calculator calculator = context.getBean(Calculator.class);
        System.out.println(calculator.summa());
        System.out.println(calculator.multiply());

    }
}
