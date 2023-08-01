package lk.ijse.util;

import lk.ijse.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration  factoryConfiguration;

    private static SessionFactory sessionFactory;
    private FactoryConfiguration() {
        //Factory Configuration
        Configuration configuration=
                new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class);

        //create session
        sessionFactory=configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return (factoryConfiguration==null)?factoryConfiguration=new FactoryConfiguration():factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }

}
