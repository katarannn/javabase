package task01;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int mouth = input.nextInt();

        if (mouth < 0 || mouth > 13) {
            System.out.println("Вы ввели не правильно число!");
        } else {
            if (mouth == 1 || mouth == 2 || mouth == 12) {
                System.out.println("зима");
            }
            if (mouth == 3 || mouth == 4 || mouth == 5) {
                System.out.println("весна");
            }
            if (mouth == 6 || mouth == 7 || mouth == 8) {
                System.out.println("лето");
            }
            if (mouth == 9 || mouth == 10 || mouth == 11) {
                System.out.println("осень");
            }
        }
    }
}
