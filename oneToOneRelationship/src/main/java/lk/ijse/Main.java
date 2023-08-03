package lk.ijse;

import lk.ijse.entity.Author;
import lk.ijse.entity.Book;
import lk.ijse.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.time.Year;

public class Main {

    public static void main(String[] args) {

        //    create New object in author type
        Author author = new Author("a_001", "Joanne", "Rollings",
                LocalDate.of(1965, 7, 31),
                "England", "J.K. Rowling, born July 31, 1965, British author of \"Harry Potter\" series." +
                " Captivating storytelling enchanted readers worldwide. Inspiring journey leaves indelible mark on " +
                "literature.");


        //    create New object in book type
        Book book = new Book(
                "B001",
                "Harry Potter",
                "ISBN-10: 0590353403",
                Year.of(1997),
                "Bloomsbury Publishing",
                "English",
                1000,
                author
        );

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

         /*Save the "author" object to the database table.*/
        session.persist(author);
        session.persist(book);

        transaction.commit();

        System.out.println("Author and Book save successfully");


    }

}
