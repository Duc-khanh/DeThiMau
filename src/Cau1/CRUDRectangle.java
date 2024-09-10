package Cau1;

import java.io.*;

public class CRUDRectangle {
    private Rectangle[] rectangleList;
    public static int numberOfRectangle;

    // Khởi tạo với 100 hình chữ nhật
    public CRUDRectangle() {
        rectangleList = new Rectangle[100];
        numberOfRectangle = 0;
    }

    // Phương thức thêm hình chữ nhật vào danh sách
    public boolean addRectangle(Rectangle objRectangle) {
        if (numberOfRectangle < rectangleList.length) {
            rectangleList[numberOfRectangle] = objRectangle;
            numberOfRectangle++;
            return true;
        }
        return false;
    }

    // Phương thức lưu một hình chữ nhật vào file
    public boolean addRectangleToFile(Rectangle objRectangle, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(objRectangle);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy một hình chữ nhật từ file
    public Rectangle getRectangleFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Rectangle) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Phương thức lưu danh sách hình chữ nhật vào file
    public boolean addRectangleListToFile(Rectangle[] listRectangle, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(listRectangle);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Phương thức lấy danh sách hình chữ nhật từ file
    public Rectangle[] getAllRectangleFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Rectangle[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

