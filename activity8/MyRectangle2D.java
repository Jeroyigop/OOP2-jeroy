
public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getwidth(double width){
        return width;
    }

    public double getheight(double height){
        return height;
    }

    public double setX(double x){
        this.x = x;
        return x;
    }
    public double setY(double y){
        this.y = y;
        return y;
    }
    public double setwidth(double width){
        this.width = width;
        return width;
    }
    public double setheight(double height){
        this.height = height;
        return height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public boolean contains(double x, double y){
        return x >= this.x && y >= this.y && x <= this.x + this.width && y <= this.y + this.height;

    }
    public boolean contains(MyRectangle2D r){
        return 2
    }










    
}
