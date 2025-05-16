class Point{
    long x,y;
    Point(int i,int j){
        x=i;
        y=j;
    }

    Point(double a,double b) {
        x=(long)a;
        y=(long)b;
    }
    
    void display(){
        System.out.println("Point : ("+x+","+y+")");
    }
}

public class Variable {
    public static void main(String[] args) {
        Point p1 = new Point(12, 8);
        p1.display();

        Point p2 = new Point(22.8, 88.4); // Type custing is data loss:::
        p2.display();

        Point p3 = new Point(12,13);
        p3.display();
    }
    
}
