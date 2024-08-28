/**
 * @description: This class represents a bank with many bank accounts
 * @author: Phuc, Le Minh
 * @version: 1.0
 * @created: 8/28/2024 6:22 PM
 */

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0.0;
        width = 0.0;
    }
    public Rectangle(double l, double w){

        if(l < 0 || w < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");

        length = l;
        width = w;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be granther than 0");
        this.length = length;
    }
    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be granther than 0");
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (length + width) * 2;
    }
}
