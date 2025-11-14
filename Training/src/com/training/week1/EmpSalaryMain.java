package com.training.week1;

public class EmpSalaryMain {
private int empId;
private String name;
private double basicSalary;
private int bonusPercentage;

public double getGrossSalary() {
	return basicSalary + (basicSalary * bonusPercentage / 100);
}

	public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	if(basicSalary<0)
		basicSalary=0;
	else
	this.basicSalary = basicSalary;
}

public int getBonusPercentage() {
	return bonusPercentage;
}

public void setBonusPercentage(int bonusPercentage) {
	if(bonusPercentage<0)
		bonusPercentage=0;
	else
	this.bonusPercentage = bonusPercentage;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpSalaryMain e=new EmpSalaryMain();
		e.setEmpId(101);
		e.setName("John Doe");
		e.setBasicSalary(50000);
		e.setBonusPercentage(10);
		System.out.println("Employee ID: "+e.getEmpId());
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Basic Salary: "+e.getBasicSalary());
		System.out.println("Bonus Percentage: "+e.getBonusPercentage());
		System.out.println("Gross Salary: "+e.getGrossSalary());

	}

}
