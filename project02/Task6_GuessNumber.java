import java.util.Random;
import java.util.Scanner;

public class Task6_GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 3;

        System.out.println("Угадай число от 1 до 100. У вас " + attempts + " попытки!");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Попытка " + attempt + ": ");
            int inputUser = scanner.nextInt();

            if (inputUser == secretNumber) {
                System.out.println("Поздравляю! Вы угадали число!");
                break;
            } else if (inputUser < secretNumber) {
                System.out.println("Загаданное число больше чем вы написали");
            } else {
                System.out.println("Загаданное число меньше чем вы написали");
            }

            if (attempt == attempts) {
                System.out.println("Попытки закончились! Загаданное число было: " + secretNumber);
            }
        }

    }
}