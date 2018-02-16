package com.cg.investments.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeSalary {
	@Id
	private long basic;
	private long houseRentAllowance;
	private long conveyanceAllowance;
	private long otherReimbursementAllowance;
	private long personalAllowance;
	private long statutoryBonus;
	private long capgeminiContributionPF;
	private long gratuity;
	private long medicalAccidentLifeInsurancePremium;
	
	public EmployeeSalary() {
		super();
	}
	
	public EmployeeSalary(long basic, long houseRentAllowance, long conveyanceAllowance,
			long otherReimbursementAllowance, long personalAllowance, long statutoryBonus, long capgeminiContributionPF,
			long gratuity, long medicalAccidentLifeInsurancePremium) {
		super();
		this.basic = basic;
		this.houseRentAllowance = houseRentAllowance;
		this.conveyanceAllowance = conveyanceAllowance;
		this.otherReimbursementAllowance = otherReimbursementAllowance;
		this.personalAllowance = personalAllowance;
		this.statutoryBonus = statutoryBonus;
		this.capgeminiContributionPF = capgeminiContributionPF;
		this.gratuity = gratuity;
		this.medicalAccidentLifeInsurancePremium = medicalAccidentLifeInsurancePremium;
	}

	public long getBasic() {
		return basic;
	}

	public void setBasic(long basic) {
		this.basic = basic;
	}

	public long getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(long houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public long getConveyanceAllowance() {
		return conveyanceAllowance;
	}

	public void setConveyanceAllowance(long conveyanceAllowance) {
		this.conveyanceAllowance = conveyanceAllowance;
	}

	public long getOtherReimbursementAllowance() {
		return otherReimbursementAllowance;
	}

	public void setOtherReimbursementAllowance(long otherReimbursementAllowance) {
		this.otherReimbursementAllowance = otherReimbursementAllowance;
	}

	public long getPersonalAllowance() {
		return personalAllowance;
	}

	public void setPersonalAllowance(long personalAllowance) {
		this.personalAllowance = personalAllowance;
	}

	public long getStatutoryBonus() {
		return statutoryBonus;
	}

	public void setStatutoryBonus(long statutoryBonus) {
		this.statutoryBonus = statutoryBonus;
	}

	public long getCapgeminiContributionPF() {
		return capgeminiContributionPF;
	}

	public void setCapgeminiContributionPF(long capgeminiContributionPF) {
		this.capgeminiContributionPF = capgeminiContributionPF;
	}

	public long getGratuity() {
		return gratuity;
	}

	public void setGratuity(long gratuity) {
		this.gratuity = gratuity;
	}

	public long getMedicalAccidentLifeInsurancePremium() {
		return medicalAccidentLifeInsurancePremium;
	}

	public void setMedicalAccidentLifeInsurancePremium(long medicalAccidentLifeInsurancePremium) {
		this.medicalAccidentLifeInsurancePremium = medicalAccidentLifeInsurancePremium;
	}

	@Override
	public String toString() {
		return "EmployeeSalary [basic=" + basic + ", houseRentAllowance=" + houseRentAllowance
				+ ", conveyanceAllowance=" + conveyanceAllowance + ", otherReimbursementAllowance="
				+ otherReimbursementAllowance + ", personalAllowance=" + personalAllowance + ", statutoryBonus="
				+ statutoryBonus + ", capgeminiContributionPF=" + capgeminiContributionPF + ", gratuity=" + gratuity
				+ ", medicalAccidentLifeInsurancePremium=" + medicalAccidentLifeInsurancePremium + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (basic ^ (basic >>> 32));
		result = prime * result + (int) (capgeminiContributionPF ^ (capgeminiContributionPF >>> 32));
		result = prime * result + (int) (conveyanceAllowance ^ (conveyanceAllowance >>> 32));
		result = prime * result + (int) (gratuity ^ (gratuity >>> 32));
		result = prime * result + (int) (houseRentAllowance ^ (houseRentAllowance >>> 32));
		result = prime * result
				+ (int) (medicalAccidentLifeInsurancePremium ^ (medicalAccidentLifeInsurancePremium >>> 32));
		result = prime * result + (int) (otherReimbursementAllowance ^ (otherReimbursementAllowance >>> 32));
		result = prime * result + (int) (personalAllowance ^ (personalAllowance >>> 32));
		result = prime * result + (int) (statutoryBonus ^ (statutoryBonus >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeSalary other = (EmployeeSalary) obj;
		if (basic != other.basic)
			return false;
		if (capgeminiContributionPF != other.capgeminiContributionPF)
			return false;
		if (conveyanceAllowance != other.conveyanceAllowance)
			return false;
		if (gratuity != other.gratuity)
			return false;
		if (houseRentAllowance != other.houseRentAllowance)
			return false;
		if (medicalAccidentLifeInsurancePremium != other.medicalAccidentLifeInsurancePremium)
			return false;
		if (otherReimbursementAllowance != other.otherReimbursementAllowance)
			return false;
		if (personalAllowance != other.personalAllowance)
			return false;
		if (statutoryBonus != other.statutoryBonus)
			return false;
		return true;
	}
	
	
}
