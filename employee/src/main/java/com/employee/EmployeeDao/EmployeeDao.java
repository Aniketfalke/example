package com.employee.EmployeeDao;

import java.sql.SQLException;

import com.Exception.DaoException;


public interface EmployeeDao {
	 public void displayAll() throws SQLException, DaoException;
	    public void updateSalary(int id) throws  DaoException;
}
