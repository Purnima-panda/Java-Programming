class Book{
    String title;
    String author;
    double price;

    Book(String t, String a) {
        title = t;
        author = a;
        price = 1800;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println("Book Details: ");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price: "+price);
    }
}


public class Student {
    public static void main(String[] args) {
        Book b1 = new Book("How To Scan?", "Mr.Arijit Mondol");
        b1.display();

        Book b2 = new Book("How To Take Rest After Running?", "Mr. Ayan Sen",30000);
        b2.display();
    }
}
