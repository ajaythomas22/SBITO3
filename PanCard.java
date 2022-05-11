package onetoone;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	
	@Id
	private String panID;
	private String panName;
	private String fathersName;
	private LocalDate dateOfBirth;
	
	@OneToOne
	@JoinColumn(name="applicantNumber")
	private BankApplicant bankApplicant;
	
	public String getPanName() {
		return panName;
	}

	public void setPanName(String panName) {
		this.panName = panName;
	}
	
	public String getPanID() {
		return panID;
	}

	public void setPanID(String panID) {
		this.panID = panID;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BankApplicant getBankApplicant() {
		return bankApplicant;
	}

	public void setBankApplicant(BankApplicant bankApplicant) {
		this.bankApplicant = bankApplicant;
	}

}
