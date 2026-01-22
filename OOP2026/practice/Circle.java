package OOP2026.practice;
 
public class Circle {

    double radius;
    double constantPI = 3.1416;

    public Circle(double Circleradius, double CircleconstantPI){
        radius = Circleradius;
        constantPI = CircleconstantPI;
            
    }

    public Circle(){}
    void getArea() {
        double area = radius * constantPI * radius;
        System.out.println("Area of Circle: " + area);
    }
}

    
