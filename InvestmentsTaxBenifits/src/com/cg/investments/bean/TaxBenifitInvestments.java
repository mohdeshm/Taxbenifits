package com.cg.investments.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TaxBenifitInvestments {
	@Id
	private long houseRentPaid;
	private long medicalInsurance;
	private long infrastructureBonds;
	private long sukanyaScheme;
	private long educationLoanBenifit;
	private long rajivGandhiEquityScheme;
	private long interestOnSavingBankAccount;

	public TaxBenifitInvestments() {
		super();
	}

	public long getHouseRentPaid() {
		return houseRentPaid;
	}

	public void setHouseRentPaid(long houseRentAllowance) {
		this.houseRentPaid = houseRentAllowance;
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

	public long geteducationLoanBenifit() {
		return educationLoanBenifit;
	}

	public void seteducationLoanBenifit(long educationLoanBenifit) {
		this.educationLoanBenifit = educationLoanBenifit;
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
		return "TaxBenifitInvestments [houseRentAllowance=" + houseRentPaid + ", medicalInsurance="
				+ medicalInsurance + ", infrastructureBonds=" + infrastructureBonds + ", sukanyaScheme=" + sukanyaScheme
				+ ", educationLoanBenifit=" + educationLoanBenifit + ", rajivGandhiEquityScheme="
				+ rajivGandhiEquityScheme + ", interestOnSavingBankAccount=" + interestOnSavingBankAccount + "]";
	}

}
