package task01;

import java.util.Random;

public class num3 {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(100);
        String mark;

        if (score >= 90 ) {
            mark = "отлично";
        } else if (score >= 60){
            mark = "хорошо";
        }else if (score >= 40){
            mark = "удовлетворительно";
        }else {
            mark = "неудовлетворительно";
        }

        System.out.println("Балл: " + score + ", - оценка: " + mark);
    }
}
