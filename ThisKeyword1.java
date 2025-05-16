class teacher{
    String name;
    double salary;

    teacher(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    teacher (teacher t){  // Copy Constractor
        this.name=t.name;
        this.salary=t.salary;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
    

   
}

public class ThisKeyword1 {
    public static void main(String[] args) {
        teacher tc = new teacher("Akash Panda", 30000);
        tc.display();
        teacher t = new teacher(tc);
        t.display();
    } 
}         
