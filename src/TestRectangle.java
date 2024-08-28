/**
 * @description: This class represents a bank with many bank accounts
 * @author: Phuc, Le Minh
 * @version: 1.0
 * @created: 8/28/2024 6:22 PM
 */

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle re1 = new Rectangle(); //Length = 0, width = 0

        System.out.println("Length: " + re1.getLength());
        System.out.println("Width: " + re1.getWidth());

        re1.setLength(10);
        re1.setWidth(3);

        System.out.println("Length: " + re1.getLength());
        System.out.println("Width: " + re1.getWidth());

        Rectangle re2 = new Rectangle(20, 5);

        System.out.println("Area: " + re2.getArea());
        System.out.println("Perimeter: " + re2.getPerimeter());
    }
}
