import java.util.Scanner;

public class Task4_TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите доход за месяц: ");
        double input = scanner.nextDouble();

        double taxRate;
        if (input <= 18800) {
            taxRate = 0.11;
        } else if (input <= 468700) {
            taxRate = 0.20;
        } else if (input <= 675700) {
            taxRate = 0.32;
        } else {
            taxRate = 0.40;
        }

        double tax = input * taxRate;
        double netIncome = input - tax;

        System.out.printf("Налоговая ставка: %.0f%%\n", taxRate * 100);

        System.out.printf("Сумма налога: %.2f \n", tax);
        
        System.out.printf("Чистый доход: %.2f \n", netIncome);

    }
}