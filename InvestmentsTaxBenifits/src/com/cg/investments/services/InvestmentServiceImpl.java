package com.cg.investments.services;

import org.springframework.stereotype.Service;

import com.cg.investments.bean.EmployeeSalary;
import com.cg.investments.bean.TaxBenifitInvestments;

@Service
public class InvestmentServiceImpl implements InvestmentService {
	long taxBenifits;
	long grossSalary;
	long houseRentAllowanceBenifit;

	@Override
	public double calculateTotalTaxSaving(EmployeeSalary employeeSalary, TaxBenifitInvestments taxBenifitInvestments) {
		long basic = employeeSalary.getBasic();
		long houseRentAllowance = employeeSalary.getHouseRentAllowance();
		long conveyanceAllowance = employeeSalary.getConveyanceAllowance();
		long otherReimbursementAllowance = employeeSalary.getOtherReimbursementAllowance();
		long personalAllowance = employeeSalary.getPersonalAllowance();
		long statutoryBonus = employeeSalary.getStatutoryBonus();
		long capgeminiContributionPF = employeeSalary.getCapgeminiContributionPF();
		long gratuity = employeeSalary.getGratuity();
		long medicalAccidentLifeInsurancePremium = employeeSalary.getMedicalAccidentLifeInsurancePremium();

		grossSalary = basic + houseRentAllowance + conveyanceAllowance + otherReimbursementAllowance + personalAllowance
				+ statutoryBonus + capgeminiContributionPF + gratuity + medicalAccidentLifeInsurancePremium;

		houseRentAllowanceBenifit = employeeSalary.getHouseRentAllowance();
		double min1 = taxBenifitInvestments.getHouseRentPaid() - 0.1 * employeeSalary.getBasic();
		double min2 = 0.4 * employeeSalary.getBasic();
		double minimum = Math.min(min1, min2);
		if (minimum < houseRentAllowanceBenifit) {
			houseRentAllowanceBenifit = (long) minimum;
		}

		taxBenifits = (taxBenifitInvestments.getInfrastructureBonds() + taxBenifitInvestments.geteducationLoanBenifit()
				+ taxBenifitInvestments.getSukanyaScheme() + taxBenifitInvestments.getInterestOnSavingBankAccount()
				+ taxBenifitInvestments.getRajivGandhiEquityScheme() + taxBenifitInvestments.getMedicalInsurance()
				+ houseRentAllowanceBenifit);
		if (taxBenifits >= 150000) {
			return 150000;
		}

		return taxBenifits;

	}

}
