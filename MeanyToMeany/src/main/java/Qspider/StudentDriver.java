package Qspider;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("omkar");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		s.setId(1);
		s.setName("omkar");
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("aks");
		
		
		
		Course c=new Course();
		c.setId(1);
		c.setCname("JAVA");
		c.setFee(45321);
		
		Course c1=new Course();
		c1.setId(2);
		c1.setCname(".net");
		c1.setFee(45321);
		
		Course c2=new Course();
		c2.setId(3);
		c2.setCname("Phython");
		c2.setFee(45321);
		
		List<Course>cr=new ArrayList<Course>();
		cr.add(c);
		cr.add(c1);
		cr.add(c2);
		
		s.setCourse(cr);
		s1.setCourse(cr);
		
		et.begin();
		em.persist(s);
		em.persist(s1);
		em.persist(c);
		em.persist(c1);
		em.persist(c2);
		et.commit();
		
		
		System.out.println("Data Saved Sucessfullyy!!!!!!");

	}

}
