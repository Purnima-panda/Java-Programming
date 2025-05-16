public class Rectangle {
    double length;
    double width;

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public Rectangle(double length, double width) 
    {
        this(length == width ? length : 0); 
        if (length != width) 
        {
            this.length = length;
            this.width = width;
        }
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

       public static void main(String[] args) 
   {
        Rectangle square = new Rectangle(5.0);  
        Rectangle rectangle = new Rectangle(4.0, 6.0);  
        
        System.out.println("Square:");
        System.out.println("Area: " + square.area());
        System.out.println("Perimeter: " + square.perimeter());
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}