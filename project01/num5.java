package task01;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите начальную скорость: ");
        double speed = input.nextDouble();

        System.out.print("Введите угол: ");
        double corner = input.nextDouble();

        System.out.print("Введите время: ");
        double time = input.nextDouble();

        final double GRAVITY = 9.81;

        double rad = Math.toRadians(corner);

        double x = speed * Math.cos(rad) * time;
        double y = speed * Math.sin(rad) * time - 4.9 * time * time;

        System.out.println("Ответ: " + "X= " + Math.round(x) + " м. , " + "Y= " + Math.round(y) + " м.");

    }
}
