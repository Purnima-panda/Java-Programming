
import java.util.Scanner;
   
// Attribute..

class Person{
    String name;
    int id;
    Double salary;
    String address;

    // Behaviour..

    void setData(String n, int i, double s, String a){
        name = n;
        id = i;
        salary = s;
        address = a;
    }
    void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Salary : "+salary);
        System.out.println("Address : "+address);
    }
    void incSalary(){
        salary+= (salary/10);
        System.out.println("Increased Salary : "+salary);
    }
    void desSalary(){
      salary-=(salary/10);
        System.out.println("Decreased Salary : "+salary);
    }
}

// Driver Class
public class Company {
    public static void main(String[] args) {
        Scanner pp = new  Scanner(System.in);
        Person c = new Person();
        String n;
        int i;
        double s;
        String a;

        System.out.println("Enter Your Name : ");
        n = pp.nextLine();
        System.out.println("Enter Your ID : ");
        i = pp.nextInt();
        System.out.println("Enter Your Salary : ");
        s = pp.nextFloat();
        pp.nextLine(); // Consume the leftover newline
        
        System.out.println("Enter Your Address : ");
        a = pp.nextLine();
        System.out.println(".....................................................................................");
        c.setData(n, i, s, a);
        c.printDetails();
        c.incSalary();
        c.desSalary();

        
    }
    
}
