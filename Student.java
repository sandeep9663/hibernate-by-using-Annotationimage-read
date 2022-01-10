package hibernateFormethod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ST_d;
	@Column(name="name")
	private String name;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int ST_d, String name, String city) {
		super();
		this.ST_d = ST_d;
		this.name = name;
		this.city = city;
	}
	public int getST_d() {
		return ST_d;
	}
	public void setST_d(int ST_d) {
		this.ST_d = ST_d;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void  setCity(String city) {
		this.city = city;
	}
	

}
