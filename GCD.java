public class GCD {
    public static void main(String[] args) {
        int number1 = 48, number2 = 88;
        while(number2 != 0)
        {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        System.out.println("GCD Is: "+number1);
    }
}
