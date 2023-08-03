package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //    create New objects in book type
        Book book = new Book(
                "B001",
                "Harry Potter",
                "ISBN-10: 0590353403",
                Year.of(1997),
                "Bloomsbury Publishing",
                "English",
                1000,
                null
        );

        Book book1 = new Book(
                "B002",
                "Game of thrones",
                "ISBN-10: 0553103547",
                Year.of(1996),
                "Bantam Spectra",
                "English",
                2000,
                null
        );

        ArrayList<Book>  bookArrayList= new ArrayList<>();
        bookArrayList.add(book);
        bookArrayList.add(book1);

        //    create New object in author type
        Author author = new Author("a_001", "Joanne", "Rollings",
                LocalDate.of(1965, 7, 31),
                "England", "J.K. Rowling, born July 31, 1965, British author of \"Harry Potter\" series." +
                " Captivating storytelling enchanted readers worldwide. Inspiring journey leaves indelible mark on " +
                "literature.",bookArrayList);

        book.setAuthor(author);
        book1.setAuthor(author);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        /*Save the "Book" objects to the database table.*/
        session.persist(book);
        session.persist(book1);
         /*Save the "author" object to the database table.*/
        session.persist(author);

        transaction.commit();

        System.out.println("Author and Books save successfully");


    }

}
