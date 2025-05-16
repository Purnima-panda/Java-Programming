import java.util.Scanner;

class Student 
{
    // Attributs..
    String name;
    int rollno;
    double marks;
    
    // Behaviour..
        
    Student(String n, int r, double m) 
    {
        this.name = n;
        this.rollno = r;
        this.marks = m;
    }

    void display() {
        System.out.println("Name Of The Student: " + name);
        System.out.println("Roll Of The Student: " + rollno);
        System.out.println("Marks Of The Student: " + marks);
    }
}

public class school 
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String nam = sc.nextLine(); 

        System.out.println("Enter your roll no: ");
        int roll = sc.nextInt(); 

        System.out.println("Enter your marks: ");
        double mar = sc.nextDouble();

        System.out.println("*********************************");

        Student s = new Student(nam, roll, mar);
        s.display();

    }
}