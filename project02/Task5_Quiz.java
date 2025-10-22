import java.util.Scanner;

public class Task5_Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[][] questions = {
                {"1+1?", "1. 4", "2. 5", "3. 2", "3"},
                {"на какой свет светафора переход дороги?", "1. зеленый", "2. красный", "3. желтый", "1"},
                {"какая кнопка вводит текст?", "1. esc", "2. Enter", "3. alt", "2"},
                {"смешать белый и серый будет?", "1. желтый", "2. серый", "3. фиолетовый", "2"},
                {"ввод в пк осущ. через что?", "1. принтер", "2. клавиатура", "3. мышь", "2"},
                {"Какая самая длинная река в мире?", "1. Амазонка", "2. Нил", "3. Волга", "1"},
                {"какой символ означает вопрос'?", "1. !", "2. ?", "3. +", "2"},
                {"Сколько цветов у радуги?", "1. 6", "2. 7", "3. 8", "2"},
                {"какой кнопкой  создаеться пробел?", "1. `", "2. пробел", "3. q", "2"},
                {"комбинация копирования текста?", "1. ctrl + t", "2. ctrl + c", "3. ctrl + v", "2"}
        };

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nВопрос " + (i + 1) + ": " + questions[i][0]);
            System.out.println(questions[i][1]);
            System.out.println(questions[i][2]);
            System.out.println(questions[i][3]);

            System.out.print("Ваш ответ (1-3): ");
            String answer = scanner.nextLine();

            if (answer.equals(questions[i][4])) {
                System.out.println("Правильно!");
                score++;
            } else {
                System.out.println("Неправильно! Правильный ответ: " + questions[i][4]);
            }
        }

        System.out.println("\nРЕЗУЛЬТАТ");
        System.out.println("Правильных ответов: " + score + " из " + questions.length);


    }
}