package com.cg.investments.services;

import com.cg.investments.bean.EmployeeSalary;
import com.cg.investments.bean.TaxBenifitInvestments;

public class RecruitmentServiceImpl implements RecruitmentService {

	@Override
	public long calculateTotalTaxSaving(EmployeeSalary employeeSalary, TaxBenifitInvestments taxBenifitInvestments) {
		
		long basic=employeeSalary.getBasic();
		long houseRentAllowance=employeeSalary.getHouseRentAllowance();
		long conveyanceAllowance=employeeSalary.getConveyanceAllowance();
		long otherReimbursementAllowance=employeeSalary.getOtherReimbursementAllowance();
		long personalAllowance=employeeSalary.getPersonalAllowance();
		long statutoryBonus=employeeSalary.getStatutoryBonus();
		long capgeminiContributionPF=employeeSalary.getCapgeminiContributionPF();
		long gratuity=employeeSalary.getGratuity();
		long medicalAccidentLifeInsurancePremium=employeeSalary.getMedicalAccidentLifeInsurancePremium(); 
		
		return basic + houseRentAllowance + conveyanceAllowance + otherReimbursementAllowance + personalAllowance
				+ statutoryBonus + capgeminiContributionPF  + gratuity
				 + medicalAccidentLifeInsurancePremium;
	}

}
