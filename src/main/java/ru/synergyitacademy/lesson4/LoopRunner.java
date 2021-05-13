package ru.synergyitacademy.lesson4;

import java.util.Random;

public class LoopRunner {

    public static void main(String[] args) {
        System.out.println("Программа начала свою работу");
        int counter = 0;
        Random random = new Random();
//        while (true) {
//            counter = random.nextInt();
//            System.out.println(counter);
//            if (counter % 2 != 0) {
//                break;
//            }
//        }

//        do {
//            counter = random.nextInt();
//            System.out.println(counter);
//            if (counter % 2 != 0) {
//                break;
//            }
//        }
//        while (true);

        for (int i = 1; i <= 100; i += 5 ) { // i = i + 5;
            System.out.println(i);
        }

        System.out.println("Программа завершила свою работу");
    }
}
