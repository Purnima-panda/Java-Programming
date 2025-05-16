class Vector{
    int i,j;

    Vector(int x,int y) {
        i=x;
        j=y;
    }
    void  addition(int x, int y){
        i+=x;
        j+=y;

        // x+=i;
        // y+=j;
        // System.out.println("Vector : "+x+"i+"+y+"j");
    }
    void subtraction(int x, int y){
        i-=x;
        j-=y;

        // x-=i;
        // y-=j;
        // System.out.println("Vector : "+x+"i+"+y+"j");
    }
    void multiplication(int x, int y){
        int dot = i*x+j*y;
        System.out.println("Result : "+dot);
    }
    void  display(){
        System.out.println("Vector : "+i+"i+"+j+"j");
    }
    
}

public class Vector2D{
    public static void main(String[] args) {
        Vector vc = new Vector(12, 14);
        vc.display();
        vc.addition(4, 5);
        vc.display();
        vc.subtraction(8, -2);
        vc.display();
        vc.multiplication(8, 18);
        // vc.display();
    }
}