package Structurel.Bridge;

public class Square extends Shape{
    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Square - ");
        color.applyColor();
    }
}

