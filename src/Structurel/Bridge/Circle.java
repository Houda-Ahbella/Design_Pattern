package Structurel.Bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.print("Drawing Circle - ");
        color.applyColor();
    }
}
