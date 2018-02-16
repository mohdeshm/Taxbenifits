package com.cg.investments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.investments.bean.EmployeeSalary;
import com.cg.investments.bean.TaxBenifitInvestments;
import com.cg.investments.services.InvestmentService;

@Controller
public class InvestmentController {

	@Autowired
	InvestmentService service;
	EmployeeSalary empSal=new EmployeeSalary();
	TaxBenifitInvestments taxBenifitInvest= new TaxBenifitInvestments();
	/**
	 *
	 * 
	 *
	 *
	 */
	@RequestMapping("/index.htm")
	public String getSalaryDetails(Model model) {		
		model.addAttribute("employeeSalary", empSal);
		return "investments";
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@RequestMapping("/salaryBreakdown.htm")
	public String storeSalaryDetails(Model model, @ModelAttribute("employeeSalary") EmployeeSalary employeeSalary) {
		empSal=employeeSalary;
		model.addAttribute("employeeSalary", empSal);
		model.addAttribute("taxBenifitInvestments",taxBenifitInvest);
		return "investments";
	}

	@RequestMapping(value = "/investments.htm", method = RequestMethod.POST)
	public String login(Model model, @ModelAttribute("taxBenifitInvestments") TaxBenifitInvestments taxBenifitInvestments) {
		taxBenifitInvest=taxBenifitInvestments;
		double savings=service.calculateTotalTaxSaving(empSal, taxBenifitInvestments);
		model.addAttribute("employeeSalary", empSal);
		model.addAttribute("taxBenifitInvestments", taxBenifitInvest);
		model.addAttribute("savings",savings);
		return "investments";
	}
		
}
