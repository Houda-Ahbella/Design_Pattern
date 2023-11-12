package Structurel.Bridge;

public class Client {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();

        Shape redCircle = new Circle(red);
        Shape greenSquare = new Square(green);

        redCircle.draw();    // Output: Drawing Circle - Applying red color
        greenSquare.draw();  // Output: Drawing Square - Applying green color
    }
}
