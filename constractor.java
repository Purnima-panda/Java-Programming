// Parameterized Consteructor.....

class Teacher{
    String name;
    Double salary;
    Teacher (String n,double s){
        name=n;
        salary=s;
    }
    void printData(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

public class constractor {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Purnima Panda",32000); // Parameter Value Store
        // t1.setdata("purnima panda",32000);
        t1.printData();
    }
}
