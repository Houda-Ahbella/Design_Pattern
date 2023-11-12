package Structurel.Flyweight;

public class Line implements Shape{
    public Line(){
        System.out.println("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void draw( int x1, int y1, int x2, int y2, String color) {
       System.out.println("Draw Line with : x1"+x1 +" x2=" +x2 +" y1=" +y1 + " y2=" + y2 + " color=" +color);
    }
}
