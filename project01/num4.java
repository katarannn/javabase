package task01;

public class num4 {
    public static void main(String[] args) {
        double speed = 30.0;
        double time = 5.0;

        final double GRAVITY = 9.81;

        double height = speed * time - (GRAVITY * time * time) / 2;

        System.out.println(height);
    }
}
