package hibernateFormethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Time;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure("hibernate.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();

		System.out.println("start coonection");
	
	System.out.println("start");
	//creating student 
	Student st = new Student();
	st.setST_d(25);
	st.setName("Akshay");
	st.setCity("Pune");
	
	//file reading 
	FileInputStream fi = new FileInputStream("src/main/resources/pic.png");
	
	byte[] data = new byte[fi.available()];
	fi.read(data);
	
	
	Session session =sf.openSession();
	Transaction tx =session.beginTransaction();
	session.save(st);
	
	//creating object of address
	Address ad = new Address();
	ad.setStreet("Street1");
	ad.setCity("Kolhapur");
	ad.setOpen(true);
	ad.setAddedDate(new Date());
	ad.setX(123.5);
	ad.setImage(data);
	
	session.save(ad);
	tx.commit();
	session.close();

	}

}
