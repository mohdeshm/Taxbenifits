<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary</title>
</head>
<body>
	
	<form:form name="salaryBreakdown" action="salaryBreakdown.htm"
		modelAttribute="employeeSalary" method="post">
		<table bgcolor="#E4E47C" align="left" border="1">
			<caption>Annual Salary Breakdown</caption>
			<tr>
				<td><form:label path="basic">Basic Salary</form:label></td>
				<td><form:input path="basic" type="number" required="required"
						maxlength="8"></form:input> <form:errors path="candidateName"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="houseRentAllowance">House Rent Allowance</form:label></td>
				<td><form:input path="houseRentAllowance" type="number"
						required="required" maxlength="8"></form:input> <form:errors
						path="houseRentAllowance"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="conveyanceAllowance">Conveyance Allowance</form:label></td>
				<td><form:input path="conveyanceAllowance" type="number"
						maxlength="8"></form:input> <form:errors
						path="conveyanceAllowance"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="otherReimbursementAllowance">Other Reimbursement Allowance</form:label></td>
				<td><form:input path="otherReimbursementAllowance"
						type="number" maxlength="8"></form:input> <form:errors
						path="otherReimbursementAllowance"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="personalAllowance">Personal Allowance</form:label></td>
				<td><form:input path="personalAllowance" type="number"
						maxlength="8"></form:input> <form:errors path="personalAllowance"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="statutoryBonus">Statutory Bonus</form:label></td>
				<td><form:input path="statutoryBonus" type="number"
						maxlength="8"></form:input> <form:errors path="statutoryBonus"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="capgeminiContributionPF">Capgemini's Contribution to PF</form:label></td>
				<td><form:input path="capgeminiContributionPF" type="number"
						required="required" maxlength="8"></form:input> <form:errors
						path="capgeminiContributionPF"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="gratuity">Gratuity</form:label></td>
				<td><form:input path="gratuity" type="number"
						required="required" maxlength="8"></form:input> <form:errors
						path="gratuity"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="medicalAccidentLifeInsurancePremium">Medical Accident Life Insurance Premium</form:label></td>
				<td><form:input path="medicalAccidentLifeInsurancePremium"
						type="number" required="required" maxlength="8"></form:input> <form:errors
						path="medicalAccidentLifeInsurancePremium"></form:errors></td>
			</tr>
			<tr>
				<td style="text-align: center;" colspan="6"><input
					type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
	
	<form:form name="investments" action="investments.htm"
		modelAttribute="taxBenifitInvestments" method="post">
		<table bgcolor="#E4E47C" align="left" border="1">
			<caption>Annual Investments</caption>
			</table></form:form>
</body>
</html>