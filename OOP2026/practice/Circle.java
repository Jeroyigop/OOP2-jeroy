package OOP2026.practice;
 
public class Circle {

    double radius;
    final double constantPI = 3.1416;

    public Circle(double Circleradius, final double CircleconstantPI){
        radius = Circleradius;
            
    }

    public Circle(){}
    void getArea() {
        double area = radius * constantPI * radius;
        System.out.println("Area of Circle: " + area);
    }
}

    
