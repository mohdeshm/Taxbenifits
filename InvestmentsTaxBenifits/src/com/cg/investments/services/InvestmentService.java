package com.cg.investments.services;

import com.cg.investments.bean.EmployeeSalary;
import com.cg.investments.bean.TaxBenifitInvestments;

public interface InvestmentService {
	public double calculateTotalTaxSaving(EmployeeSalary employeeSalary, TaxBenifitInvestments taxBenifitInvestments);
}

