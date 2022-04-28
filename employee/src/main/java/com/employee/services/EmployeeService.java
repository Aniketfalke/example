package com.employee.services;

import java.sql.SQLException;
import com.Exception.ServiceException;


public interface EmployeeService {
	public void displayAll() throws ServiceException, SQLException;
    public void updateSalary(int id) throws ServiceException;
}
