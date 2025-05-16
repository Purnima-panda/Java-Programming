// Planing

class Book {

    // Attributes
    String name;
    float price;
    int pagecount;
    String author;
}
public class Booksshop{
    public static void main(String[] args) {
        Book purnima = new Book();
        purnima.name = "Engineering";
        purnima.price = 814.56f;
        purnima.pagecount=885;
        purnima.author="Balaguru Swami";
        System.out.println("............Book Details..........");
        System.out.println(purnima.name);
        System.out.println(purnima.price);
        System.out.println(purnima.pagecount);
        System.out.println(purnima.author);
    }
}