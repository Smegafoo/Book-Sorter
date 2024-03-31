import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book=new TreeSet<>(new BookComparator());
        book.add(new Book("Sefiller                    ",1724));
        book.add(new Book("Küçük Prens                 ",112));
        book.add(new Book("Satranç                     ",116));
        book.add(new Book("Nasıl Ölünür                ",234));
        book.add(new Book("Bir İdam Mahkumunun Son Günü",375));
        System.out.println("By name:");
        for (Book book1:book) {
            System.out.println("Book Name:"+book1.getBookName()+"  |  Book Page Number:"+book1.getBookPageNumber());
        }
        System.out.println("################################################################");
        TreeSet<Book> book2=new TreeSet<>(new BookPageComprarator().reversed());
        book2.add(new Book("Sefiller                    ",1724));
        book2.add(new Book("Küçük Prens                 ",112));
        book2.add(new Book("Satranç                     ",116));
        book2.add(new Book("Nasıl Ölünür                ",234));
        book2.add(new Book("Bir İdam Mahkumunun Son Günü",375));
        System.out.println("By page number:");
        for(Book book1:book2){
            System.out.println("Book Name:"+book1.getBookName()+"  |  Book Page Number:"+book1.getBookPageNumber());
        }

    }
}