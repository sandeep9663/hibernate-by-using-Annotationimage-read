package hibernateFormethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class main {
	  private static SessionFactory sessionFactory;


	    private static SessionFactory buildSessionFactory() {      
	            try {
	                Configuration configuration = new Configuration();
	                configuration.configure("hibernate.cfg.xml");

	                sessionFactory = configuration.buildSessionFactory();

	            } catch (Exception e) {
	                e.printStackTrace();
	               
	                }
	            
	        return sessionFactory;
	    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		
	System.out.println("start coonection");
	
	System.out.println("start");
	//creating student 
	Student st = new Student();
	st.setST_d(113);
	st.setName("Akshay");
	st.setCity("Pune");
	
	//creating object of address
	Address ad = new Address();
	ad.setStreet("Street3");
	ad.setCity("Kolhapur");
	ad.setOpen(true);
	ad.setAddedDate(new Date());
	ad.setX(123.5);
	

	//file reading 
	
FileInputStream fi = new FileInputStream("src/main/resources/pic.png");
	
	byte[] data = new byte[fi.available()];
	fi.read(data);
	ad.setImage(data);
	
	Session session =buildSessionFactory().openSession();
	Transaction tx =session.beginTransaction();
	session.save(st);
	
	session.save(ad);
	tx.commit();
	
	
	
//	// fetch data from database get
//			Address address = (Address) session.get(Address.class, 1);
//			System.out.println(address.getCity());
//	
//			Address address1 = (Address) session.get(Address.class, 1);
//			System.out.println(address1.getCity());
	
//	//fetch data from database get
//	Student student =(Student)session.get(Student.class, 25);
//	System.out.println(student);

	// fetch data from database by load 
	Student student =(Student)session.load(Student.class, 111);
	System.out.println(student);
//	Student student1 =(Student)session.load(Student.class, 111);
//	System.out.println(student1);
	
	

	session.close();
	
	session.close();

	}

}
