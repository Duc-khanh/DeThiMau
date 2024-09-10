package Cau1;

public abstract class Main {

    public static void main(String[] args) {
        CRUDRectangle crudRectangle = new CRUDRectangle();

        Rectangle rectangle = new Rectangle("Rectangle1", "Red", 5, 10);
        Rectangle rectangle2 = new Rectangle("Rectangle2", "Blue", 10, 20);
        Rectangle rectangle3 = new Rectangle("Rectangle3", "Black", 15, 30);
        Rectangle rectangle4 = new Rectangle("Rectangle4", "Black", 15, 30);
//        Shape shape = new Shape("rectangle", "Blue");
//        System.out.println(shape);
//        rectangle.setWidth(15);
//        System.out.println(rectangle);
//        System.out.println(rectangle.calArea());
//

        // Thêm vào mảng danh sách hình chữ nhật

        crudRectangle.addRectangle(rectangle);
        crudRectangle.addRectangle(rectangle2);
        crudRectangle.addRectangle(rectangle3);

        // Lưu từng hình chữ nhật vào file
        crudRectangle.addRectangleToFile(rectangle, "rectangle1.dat");
        crudRectangle.addRectangleToFile(rectangle2, "rectangle2.dat");
        crudRectangle.addRectangleToFile(rectangle3, "rectangle3.dat");

        // Hiển thị thông tin hình chữ nhật từ file
        System.out.println("Rectangle from file: " + crudRectangle.getRectangleFromFile("rectangle1.dat"));
        System.out.println("Rectangle from file: " + crudRectangle.getRectangleFromFile("rectangle2.dat"));
        System.out.println("Rectangle from file: " + crudRectangle.getRectangleFromFile("rectangle3.dat"));

        // Lưu mảng danh sách hình chữ nhật vào file
        crudRectangle.addRectangleListToFile(new Rectangle[]{rectangle, rectangle2, rectangle3}, "rectangleList.dat");

        // Hiển thị tất cả hình chữ nhật trong file
        Rectangle[] rectanglesFromFile = crudRectangle.getAllRectangleFromFile("rectangleList.dat");
        if (rectanglesFromFile != null) {
            for (Rectangle rectangles : rectanglesFromFile) {
                System.out.println(rectangles);
            }
        }


    }
}
