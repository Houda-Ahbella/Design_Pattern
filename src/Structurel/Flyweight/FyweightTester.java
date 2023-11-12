package Structurel.Flyweight;

public class FyweightTester {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.ShapeType.OVAL_FILL);
        shape1.draw(1,2,100,200,"red");
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.ShapeType.OVAL_FILL);
        shape1.draw(1,2,100,200,"orange");
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.ShapeType.LINE);
        shape1.draw(1,2,1,2,"orange");
    }
}
