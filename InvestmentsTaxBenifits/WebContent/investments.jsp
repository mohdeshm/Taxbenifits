<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary</title>
</head>
<body>
<!-- 	<div ng-app=""> -->
		<c:if test="${employeeSalary ne null }">
			<form:form name="salaryBreakdown" action="salaryBreakdown.htm"
				modelAttribute="employeeSalary" method="post">
				<table bgcolor="#E4E47C" align="left" border="1">
					<caption>Annual Salary Breakdown</caption>
					<tr>
						<td><form:label path="basic">Basic Salary</form:label></td>
						<td><form:input path="basic" type="number"
								required="required" maxlength="8" ></form:input>
							<form:errors path="basic"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="houseRentAllowance">House Rent Allowance</form:label></td>
						<td><form:input path="houseRentAllowance" type="number"
								required="required" maxlength="8" ></form:input>
							<form:errors path="houseRentAllowance"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="conveyanceAllowance">Conveyance Allowance</form:label></td>
						<td><form:input path="conveyanceAllowance" type="number"
								maxlength="8" ></form:input> <form:errors
								path="conveyanceAllowance"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="otherReimbursementAllowance">Other Reimbursement Allowance</form:label></td>
						<td><form:input path="otherReimbursementAllowance"
								type="number" maxlength="8"
								></form:input> <form:errors
								path="otherReimbursementAllowance"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="personalAllowance">Personal Allowance</form:label></td>
						<td><form:input path="personalAllowance" type="number"
								maxlength="8" ></form:input> <form:errors
								path="personalAllowance"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="statutoryBonus">Statutory Bonus</form:label></td>
						<td><form:input path="statutoryBonus" type="number"
								maxlength="8" ></form:input> <form:errors
								path="statutoryBonus"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="capgeminiContributionPF">Capgemini's Contribution to PF</form:label></td>
						<td><form:input path="capgeminiContributionPF" type="number"
								required="required" maxlength="8"
								></form:input> <form:errors
								path="capgeminiContributionPF"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="gratuity">Gratuity</form:label></td>
						<td><form:input path="gratuity" type="number"
								required="required" maxlength="8" ></form:input>
							<form:errors path="gratuity"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="medicalAccidentLifeInsurancePremium">Medical Accident Life Insurance Premium</form:label></td>
						<td><form:input path="medicalAccidentLifeInsurancePremium"
								type="number" required="required" maxlength="8"
								></form:input> <form:errors
								path="medicalAccidentLifeInsurancePremium"></form:errors></td>
					</tr>
					<tr>
						<td>Total Salary</td>
						<td>${totalSalary}</td>
<!-- 						(houseRentAllowance) + (conveyanceAllowance) + (otherReimbursementAllowance) + (personalAllowance) + (statutoryBonus) + (capgeminiContributionPF) + (gratuity) + (medicalAccidentLifeInsurancePremium) -->
					</tr>
					<tr>
						<td style="text-align: center;" colspan="6"><input
							type="submit" value="Save" /></td>
					</tr>
				</table>
			</form:form>
		</c:if>

		<c:if test="${taxBenifitInvestments ne null }">
			<form:form name="investments" action="investments.htm"
				modelAttribute="taxBenifitInvestments" method="post">
				<table bgcolor="#E4E47C" align="right" border="1">
					<caption>Annual Investments</caption>
					<tr>
						<td><form:label path="houseRentPaid">House Rent Paid</form:label></td>
						<td><form:input path="houseRentPaid" type="number"
								maxlength="8"></form:input> <form:errors path="houseRentPaid"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="medicalInsurance">Medical Insurance</form:label></td>
						<td><form:input path="medicalInsurance" type="number"
								maxlength="8"></form:input> <form:errors path="medicalInsurance"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="infrastructureBonds">Infrastructure Bonds</form:label></td>
						<td><form:input path="infrastructureBonds" type="number"
								maxlength="8"></form:input> <form:errors
								path="infrastructureBonds"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="sukanyaScheme">Sukanya Scheme</form:label></td>
						<td><form:input path="sukanyaScheme" type="number"
								maxlength="8"></form:input> <form:errors path="sukanyaScheme"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="educationLoanBenifit">Education Loan Benifit</form:label></td>
						<td><form:input path="educationLoanBenifit" type="number"
								maxlength="8"></form:input> <form:errors
								path="educationLoanBenifit"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="rajivGandhiEquityScheme">Rajiv Gandhi Equity Scheme</form:label></td>
						<td><form:input path="rajivGandhiEquityScheme" type="number"
								maxlength="8"></form:input> <form:errors
								path="rajivGandhiEquityScheme"></form:errors></td>
					</tr>
					<tr>
						<td><form:label path="interestOnSavingBankAccount">Interest On Saving Bank Account</form:label></td>
						<td><form:input path="interestOnSavingBankAccount"
								type="number" maxlength="8"></form:input> <form:errors
								path="interestOnSavingBankAccount"></form:errors></td>
					</tr>
					<tr>
						<td style="text-align: center;" colspan="6"><input
							type="submit" value="Save" /></td>
					</tr>
				</table>
			</form:form>
		</c:if>

		<c:if test="${savings ne null }">
			<form name="savingtotal" action="index.htm" method="post">
				<table bgcolor="#E4E47C" align="right" border="1">
					<tr>
						<td><input value="${savings}" readonly></input></td>
					</tr>
					<tr>
						<td><input type="button" value="Reset"></td>
					</tr>
				</table>
			</form>
		</c:if>
	</div>
</body>
</html>