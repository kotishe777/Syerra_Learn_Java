package collections;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go(){
        Book b1 = new Book("Cats");
        Book b2 = new Book("Dogs");
        Book b3 = new Book("Parrots");

        TreeSet<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}

class Book {
    String title;

    public Book(String t){
        title = t;
    }
}
