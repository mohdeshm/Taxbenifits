package com.cg.investments.bean;

public class TaxBenifitInvestments {
	private long houseRentAllowance;
	private long medicalInsurance;
	private long infrastructureBonds;
	private long sukanyaScheme;
	private long educationLonaBenifit;
	private long rajivGandhiEquityScheme;
	private long interestOnSavingBankAccount;

	public TaxBenifitInvestments() {
		super();
	}

	public long getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(long houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public long getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(long medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public long getInfrastructureBonds() {
		return infrastructureBonds;
	}

	public void setInfrastructureBonds(long infrastructureBonds) {
		this.infrastructureBonds = infrastructureBonds;
	}

	public long getSukanyaScheme() {
		return sukanyaScheme;
	}

	public void setSukanyaScheme(long sukanyaScheme) {
		this.sukanyaScheme = sukanyaScheme;
	}

	public long getEducationLonaBenifit() {
		return educationLonaBenifit;
	}

	public void setEducationLonaBenifit(long educationLonaBenifit) {
		this.educationLonaBenifit = educationLonaBenifit;
	}

	public long getRajivGandhiEquityScheme() {
		return rajivGandhiEquityScheme;
	}

	public void setRajivGandhiEquityScheme(long rajivGandhiEquityScheme) {
		this.rajivGandhiEquityScheme = rajivGandhiEquityScheme;
	}

	public long getInterestOnSavingBankAccount() {
		return interestOnSavingBankAccount;
	}

	public void setInterestOnSavingBankAccount(long interestOnSavingBankAccount) {
		this.interestOnSavingBankAccount = interestOnSavingBankAccount;
	}

	@Override
	public String toString() {
		return "TaxBenifitInvestments [houseRentAllowance=" + houseRentAllowance + ", medicalInsurance="
				+ medicalInsurance + ", infrastructureBonds=" + infrastructureBonds + ", sukanyaScheme=" + sukanyaScheme
				+ ", educationLonaBenifit=" + educationLonaBenifit + ", rajivGandhiEquityScheme="
				+ rajivGandhiEquityScheme + ", interestOnSavingBankAccount=" + interestOnSavingBankAccount + "]";
	}

}
