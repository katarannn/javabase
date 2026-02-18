import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // "Склад" с разными сортами кофе
        List<Coffee> warehouse = new ArrayList<>();
        warehouse.add(new Coffee("Arabica Premium", "зерно", 15.0, 1.0, 0.8, 9));
        warehouse.add(new Coffee("Robusta Strong", "молотый", 10.0, 0.8, 0.7, 7));
        warehouse.add(new Coffee("Instant Gold", "растворимый в банке", 8.0, 0.3, 0.5, 8));
        warehouse.add(new Coffee("Instant Budget", "растворимый в пакетиках", 5.0, 0.25, 0.4, 5));
        warehouse.add(new Coffee("Espresso Bar", "зерно", 12.0, 0.9, 0.75, 8));
        warehouse.add(new Coffee("Breakfast Blend", "молотый", 9.0, 0.7, 0.6, 6));

        // Фургон: ограничения по объему и деньгам
        CoffeeVan van = new CoffeeVan(3.0, 30.0);

        // Загружаем фургон (простая логика — идем по списку и пробуем добавить)
        for (Coffee c : warehouse) {
            boolean added = van.addCoffee(c);
            if (added) {
                System.out.println("Добавлен в фургон: " + c.getName());
            } else {
                System.out.println("НЕ поместился/дорогой: " + c.getName());
            }
        }

        System.out.println();
        System.out.println("Содержимое фургона (до сортировки):");
        for (Coffee c : van.getLoad()) {
            System.out.println(c);
        }

        // Сортировка по цене за кг
        van.sortByPricePerKg();
        System.out.println();
        System.out.println("Содержимое фургона (после сортировки по цене/кг):");
        for (Coffee c : van.getLoad()) {
            System.out.println(c);
        }

        // Поиск по диапазону качества
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Введите минимальное качество (1-10): ");
        int minQ = scanner.nextInt();
        System.out.print("Введите максимальное качество (1-10): ");
        int maxQ = scanner.nextInt();

        List<Coffee> found = van.findByQualityRange(minQ, maxQ);
        System.out.println();
        System.out.println("Товары в фургоне с качеством от " + minQ + " до " + maxQ + ":");
        if (found.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            for (Coffee c : found) {
                System.out.println(c);
            }
        }

        scanner.close();
    }
}


