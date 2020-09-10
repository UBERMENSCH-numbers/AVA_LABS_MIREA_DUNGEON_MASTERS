package Pr_3;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double width) {
        super(width, width);
    }

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }


    public void setLength(double side){
        this.length = side;
        this.width = side;
    }


    public void setWidth(double side){
        this.length = side;
        this.width = side;
    }

    public String toString() {
        return width + color + filled;
    }

}
