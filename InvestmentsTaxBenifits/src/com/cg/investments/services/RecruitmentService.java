package com.cg.investments.services;

import com.cg.investments.bean.EmployeeSalary;
import com.cg.investments.bean.TaxBenifitInvestments;

public interface RecruitmentService {
	public long calculateTotalTaxSaving(EmployeeSalary employeeSalary, TaxBenifitInvestments taxBenifitInvestments);
}

