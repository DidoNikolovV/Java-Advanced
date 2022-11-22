package Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        System.out.println("Unoredered books");

        for(Book b : books) {
            System.out.println(b);
        }

        System.out.println("Ordered by year with stream");

        books.stream()
                .sorted(new BookComparatorByYear())
                .forEach(System.out::println);

        System.out.println("Ordered by natural order(Comparable<Book>)");

        books.stream()
                .sorted()
                .forEach(System.out::println);

        TreeSet<Book> setOfBooks = new TreeSet<>(new BookComparatorByYear());
        setOfBooks.add(bookOne);
        setOfBooks.add(bookTwo);
        setOfBooks.add(bookThree);

        System.out.println("Ordered in TreeSet by year");

        for(Book b : setOfBooks) {
            System.out.println(b);
        }


    }
}
