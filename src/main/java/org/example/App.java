package org.example;

import org.example.model.Laptop;
import org.example.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Hibernate" );

   /*     MyName my = new MyName();
        my.setFname("Hi");
        my.setLname("KAJOL");

        Informations  info = new Informations();

        //info.setId(1);
        info.setName(my);
        info.setStatus("Trainee");*/



        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLaptop_name("DELL");

        Student student = new Student();
        student.setName("KAJOL");
        student.setLevel("B.Sc");
        student.getLaptop().add(laptop);

        laptop.getStudent().add(student);


        Configuration con = new Configuration();
        con = con .configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        con = con.configure().addResource("hibernate.cfg.xml");

        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();

        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();
        Transaction tx =  session.beginTransaction();

        //to fetch data from db
      /// info = (Informations) session.get(Informations.class,6);

        session.save(laptop);
        session.save(student);

        tx.commit();


    }
}
