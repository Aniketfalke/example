package com.employee.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.Exception.ServiceException;
import com.employee.services.EmployeeService;
import com.employee.services.servicesImpl.EmployeeServiceImpl;



public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeService e=new EmployeeServiceImpl();
		try {
			e.displayAll();
		} catch (ServiceException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Enter valid employee id");
		int id=sc.nextInt();
		 try {
			e.updateSalary(id);
		} catch (ServiceException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}


