package Lan2;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle1", "Red", 5, 10);
        Rectangle rectangle2 = new Rectangle("Rectangle2", "Blue", 10, 20);
        Rectangle rectangle3 = new Rectangle("Rectangle3", "Black", 15, 30);
        System.out.println(rectangle);
        System.out.println(rectangle.calArea());
        System.out.println(rectangle2);
        System.out.println(rectangle2.calArea());
        System.out.println(rectangle3);
        System.out.println(rectangle3.calArea());
    }
}
