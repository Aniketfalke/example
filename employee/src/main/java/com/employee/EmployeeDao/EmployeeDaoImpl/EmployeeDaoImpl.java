package com.employee.EmployeeDao.EmployeeDaoImpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.DbUtil.DbUtil;
import com.Exception.DaoException;
import com.employee.EmployeeDao.EmployeeDao;

public class EmployeeDaoImpl implements EmployeeDao  {
         static Connection con=null;
         static Statement st=null;
         static ResultSet rs=null;
         
         DbUtil db=new DbUtil();
         
	public void displayAll() throws SQLException, DaoException {
		// TODO Auto-generated method stub
		con=db.myConnection();
        String q="SELECT * FROM EMPLOYEES";
        try {
        st=con.createStatement();
        rs=st.executeQuery(q);
        while(rs.next()) {
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			System.out.println("-------------------------");
        }
        }catch(SQLException e){
          throw new DaoException("SQL Exception occur ",e);	
        }
       /* finally {
          if(rs!=null) {
        	  
        		try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
          }
          try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }*/
	}

	public void  updateSalary(int id) throws DaoException  {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		try {
			rs=st.executeQuery("SELECT EMP_ID FROM EMPLOYEES");
			while(rs.next()) {
				if(id==rs.getInt(1)) {
					System.out.println("Enter new salary");
					int salary=sc.nextInt();
					 st=con.createStatement();
					st.executeUpdate("update  employees set SALARY="+salary+"where EMP_ID="+id);
					System.out.println(" Successfully updated"); 
					
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 throw new DaoException("SQL Exception occur : id is incorrect",e);
		}
		
		
	   
		
	}

}
