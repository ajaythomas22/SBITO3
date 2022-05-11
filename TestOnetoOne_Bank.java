import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import onetoone.BankApplicant;
import onetoone.PanCard;

public class TestOnetoOne_Bank {
	
	@Test
	public void testBankApplicantInsert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory: " + emf);
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager: " + em);
		EntityTransaction et = em.getTransaction();

		BankApplicant bankObj = new BankApplicant();
		PanCard panObj = new PanCard();

		et.begin();
		bankObj.setApplicantNumber(1);
		bankObj.setApplicantName("Anand");
		bankObj.setEmailAddress("anand@gmail.com");
		bankObj.setMobile("9567103471");
		bankObj.setAppliedFor("Savings A/C");
		bankObj.setApplicationStatus("Applied");
		bankObj.setAddress("Trivandrum");
		bankObj.setBirthdate(LocalDate.of(1990, 8, 22));
		
		panObj.setPanID("AKCPT4943M");
		panObj.setPanName("Anand Jayakumar");
		panObj.setFathersName("Jayakumar");
		panObj.setDateOfBirth(LocalDate.of(1990, 8, 22));

		bankObj.setPanCard(panObj); 
		panObj.setBankApplicant(bankObj);
		 

		System.out.println("Trying to persist");
		em.persist(bankObj);
		em.persist(panObj);
		System.out.println("Persisted");
		et.commit();

	}
	
	@Test
	public void addPANWithoutBankApplicant() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory: " + emf);
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager: " + em);
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		PanCard pa = new PanCard();
		pa.setPanID("ASKDH7894G");
		pa.setPanName("Sruthi");
		pa.setFathersName("Nair");
		pa.setDateOfBirth(LocalDate.of(1991, 10, 8));
		
		em.persist(pa);
		et.commit();
	}

	@Test 
	public void assignPANtoExistingBankApplicant()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory: " + emf);
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager: " + em);
		EntityTransaction et = em.getTransaction();

		et.begin();
			BankApplicant ba = em.find(BankApplicant.class, 3);
			PanCard pa = em.find(PanCard.class, "ASKDH7894G");
			pa.setBankApplicant(ba); //fill up the foreign key person_id
			em.merge(pa);
		et.commit();
	}
	
}
