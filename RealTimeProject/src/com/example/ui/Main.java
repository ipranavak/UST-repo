package com.example.ui;

import java.sql.*;



import javax.swing.JOptionPane;

import java.util.*;

import com.example.bean.EmployeeBean;

import com.example.dao.AdminstratorDao;

public class Main {

public static void main(String[] args)throws ClassNotFoundException, SQLException {

ArrayList<EmployeeBean> al=AdminstratorDao.selectAllEmployee();

String str="";

for(EmployeeBean e:al)

{

str+=e.getId()+" "+e.getName()+" "+e.getSalary()+"\n";

}

JOptionPane.showMessageDialog(null, str);

//	int id=Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID"));

//	EmployeeBean e1=AdministratorDao.selectEmployeeById(id);

//JOptionPane.showMessageDialog(null, e1.getId()+" "+e1.getName()+" "+e1.getSalary());

	//JOptionPane.showMessageDialog(null, AdministratorDao.deleteEmployee(id)+" record deleted successfully...");

	//	String name=JOptionPane.showInputDialog("Enter Employee Name");

//	int salary=Integer.parseInt(JOptionPane.showInputDialog("Enter Salary"));

//	EmployeeBean eb=new EmployeeBean();

//	eb.setId(id);

//	eb.setName(name);

//	eb.setSalary(salary);

	//JOptionPane.showMessageDialog(null, AdministratorDao.addEmployee(eb)+" record inserted successfully...");

//	JOptionPane.showMessageDialog(null,AdministratorDao.updateEmployee(eb)+" record updated successfully....");

}

}