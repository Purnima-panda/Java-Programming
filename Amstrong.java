public class Amstrong {
    public static void main(String[] args) {
        int num=371;
        int a=0,temp=num;
        while(temp!=0)
        {
            temp/=10;
            a++;
        }
        int store=0, original=num;
        while(num!=0)
        {
            int digit = num%10;
            store+=Math.pow(digit,a);
            num=num/10;
        }
        if(original==store)
        {
            System.out.println(".....Amstrong Number.....");
        }
        else
        {
            System.out.println(".....Not Amstrong Number.....");
        }

    }
    
}
