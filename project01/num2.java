package task01;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("свой возраст: ");
        int age = input.nextInt();

        if (age > 0 && age < 8){
            System.out.println("Вы преобрели детсикй билет");
        }
        else if (age > 6 && age < 18){
            System.out.println("Вы преобрели подросковый билет");
        }
        else if (age > 17 && age < 61){
            System.out.println("Вы преобрели взрослый билет");
        }
        else if (age > 60 ){
            System.out.println("Вы преобрели пинсионерский билет");
        }
    }
}
