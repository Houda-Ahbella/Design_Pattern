package Structurel.Flyweight;

public class Oval implements Shape{
    //intrinsic property
    private boolean fill;
    public Oval(boolean f){
        this.fill=f;
        System.out.println("Creating Oval object with fill="+f);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void draw(int x, int y, int width, int height, String color) {
        if(fill)
        System.out.println("Draw Oval fill : x"+x +" y=" +y +" width=" +width + " height=" + height + " color=" +color);
        else System.out.println("Draw Oval not fill : x"+x +" y=" +y +" width=" +width + " height=" + height + " color=" +color);
    }
}
