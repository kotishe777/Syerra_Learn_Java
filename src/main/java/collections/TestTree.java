package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go(){
        Book b1 = new Book("Cats");
        Book b2 = new Book("Dogs");
        Book b3 = new Book("Parrots");

        BookCompare bCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<>(bCompare);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}

class Book implements Comparable{
    String title;

    public Book(String t){
        title = t;
    }

    public int compareTo(Object b){
        Book book = (Book) b;
        return title.compareTo(book.title);
    }
}

class BookCompare implements Comparator<Book>{
    public int compare (Book one, Book two){
        return (one.title.compareTo(two.title));
    }
}
