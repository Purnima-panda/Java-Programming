class Account{
    String accountNumber;
    double Balance;

    Account(String a, double b) {
        accountNumber = a;
        Balance = b;
        if(a!=null && a.length()>0){
            accountNumber=a;
            if(b>=0){
                Balance=b;
            }
            else{
                Balance=10;
            }
        }
        else{
            System.out.println("ERROR: Invalid Account Number");
        }
    }

    

    void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Tpotal Balance: "+Balance);
    }
}

public class AccNo {
    public static void main(String[] args) {
        Account ac = new Account("SBI3648454",-120);
        ac.display();

    }
    
}
