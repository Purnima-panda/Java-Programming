public class year{
    public static void main(String[] args) {
        int months,years;
        int days = 884;
        years = days/365;
        months = (days%365)/30;
        days = (days%365)%30;
        System.out.println("years:" +years);
        System.out.println("months:" +months);
        System.out.println("days:" +days);
    }
}
