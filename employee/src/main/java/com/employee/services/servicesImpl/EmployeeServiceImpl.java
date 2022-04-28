package com.employee.services.servicesImpl;

import java.sql.SQLException;

import com.Exception.DaoException;
import com.Exception.ServiceException;
import com.employee.EmployeeDao.EmployeeDao;
import com.employee.EmployeeDao.EmployeeDaoImpl.EmployeeDaoImpl;
import com.employee.services.EmployeeService;



public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao dao=new EmployeeDaoImpl();

	public void displayAll() throws ServiceException, SQLException {
		
	        try {
				dao.displayAll();
			} catch (  DaoException e) {
				// TODO Auto-generated catch block
			   throw new ServiceException("From services layer ",e);
			}

	}

	public void updateSalary(int id) throws ServiceException  {
		// TODO Auto-generated method stub
		try {
			dao.updateSalary(id);
		} catch (DaoException e) {
			// TODO Auto-generated catch block
			throw new ServiceException("from service layer",e);
		}
	}

}
