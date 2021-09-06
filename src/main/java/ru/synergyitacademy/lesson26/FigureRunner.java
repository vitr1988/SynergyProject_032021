package ru.synergyitacademy.lesson26;

public class FigureRunner {

    public static void main(String[] args) {
        Figure rectangle = new Rectangle()
                .setA(4)
                .setB(5);
        System.out.println(rectangle.square());

        Figure quadrat = new Quadrat().setB(5);
        System.out.println(quadrat.square());
    }
}
