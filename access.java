// ***ATTRIBUTE AND BEHAVIOUR ACCESS***

class Student {
    // Attributes
    String name;
    int roll;

    // Behaviour
    void learn(){
        System.out.println("I Am Learning Java");
    }
    void play(){
        System.out.println("I Am Playing Cricket");
    }
    void printdetails(){
        System.out.println("Name :: "+name);
        System.out.println("Roll :: "+roll);
    }

}

public class access{
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "Purnima Panda";
        stu1.roll = 8;
        stu1.printdetails();
        stu1.learn();
        stu1.play();
    }
}