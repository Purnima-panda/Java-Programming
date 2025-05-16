public class fahrenheit {
    public static void main(String[] args) {
        int f=108;

        double temp=5.0/9.0;
        double c=temp*(f-32);
        System.out.println("Centrigate Temprature: "+Math.ceil(c));
        if(c<=0)
        {
            System.out.println("FREEZING");
        }
        else if(c<=10)
        {
            System.err.println("VERY COLD");
        }
        else if(c<=20)
        {
            System.err.println("COLD");
        }
        else if(c<30)
        {
            System.err.println("NORMAL");
        }
        else if(c<=40)
        {
            System.out.println("IT'S HOT");
        }
        else 
        {
            System.out.println("IT'S VERY VERY HOT..... O MY GOD..");
        }

    }
}
