package ru.mirea.BallClass;

public class BallTest {
    public static void main(String[] args) {
        Ball one = new Ball();
        one.setRadius(7);
        one.setColor("green");
        System.out.println("Радиус мяча: " + one.getRadius());
        System.out.print("Цвет мяча: " + one.getColor());
    }
}
