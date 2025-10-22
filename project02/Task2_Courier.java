public class Task2_Courier {
    public static void main(String[] args) {
        int floors = 10;
        int apartmentsFloor = 5;

        for (int floor = 1; floor <= floors; floor++) {
            for (int i = 1; i <= apartmentsFloor; i++) {
                System.out.println("Этаж: " + floor + ", Квартира: " + i + " - посылка доставлена");
            }
        }

        System.out.println("Все посылки доставлены!");
    }
}