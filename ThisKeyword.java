

class teacher{
    String name;
    double salary;

    teacher(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }

    void printteacher(teacher t){
        System.out.println("Name : "+t.name);
        System.out.println("Salary : "+t.salary);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        
      teacher tc = new teacher("Akash Panda", 30000);
      teacher tc1 = new teacher("Rohon Mishra", 60000);
      tc.display();
      tc.printteacher(tc1);
    }       
}
