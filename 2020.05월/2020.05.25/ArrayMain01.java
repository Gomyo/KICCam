class Book {
    String title;
    String author;
    int price;
    // Book Constructor
    Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
public class ArrayMain01 {
    public static void main(String[] args) {
        int[] intArray = new int[3];
        for (int i=1; i<=3; i++) {
            intArray[i-1] = i*10; 
        }
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

        Book[] books = new Book[3];
        Book book1 = new Book("title1","일",1000);
        Book book2 = new Book("title2", "이", 2000);
        Book book3 = new Book("title3", "삼", 3000);
        // Put these in books array:
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        
        System.out.println(books.length);
        
        Book book = books[2];
        System.out.println(book.title);
        System.out.println(book.author);
        // Upper is available, but 
        System.out.println(books[2].title);
        System.out.println(books[2].author);

        // normal for
        for (int x=0; x<=2; x++) {
            System.out.println(books[x].title);
            System.out.println(books[x].author);
            System.out.println(books[x].price);
        }
        for (int x = 0; x <= 2; x++) {
            System.out.printf("%s %s %d%n", books[x].title, books[x].author, books[x].price);
        }

        System.out.println("---------------------------------");
        // 향상된 for each
        // 생성자를 갖다 쓰면 되는구만
        for ( Book Book : books) {
            System.out.println(Book.title);
            System.out.println(Book.author);
            System.out.println(Book.price);
        }
        for ( Book Book : books) {
            System.out.printf("%s %s %d%n", Book.title, Book.author, Book.price);
        }
    }
}