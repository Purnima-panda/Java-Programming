public class coordinate {
    public static void main(String[] args) {
        int x=4,y=-8;
        if(x==0 && y==0){
            System.out.println("Origin..");
        }
        else if(x>0 && y>0){
            System.out.println("First Quadrant..");
        }
        else if(x<0 && y>0){
            System.out.println("Second Quadrant..");
        }
        else if(x<0 && y<0){
            System.out.println("Third Quadrant..");
        }
        else if(x>0 && y<0){
            System.out.println("Forth Quadrant..");
        }
    }
}
