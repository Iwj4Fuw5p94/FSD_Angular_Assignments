package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hexaware.entity.Employee;
import com.hexaware.util.MyDBConnection;

public class EmployeeDao {
	Connection connection;
	Statement statement;
	PreparedStatement ps;
	ResultSet rs;

	public void insertEmployee(Employee emp) {
		try {
			connection = MyDBConnection.getMyDbConnection();
			ps = connection.prepareStatement("insert into hexaemp values(?,?)");
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " inserted successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void showEmployee() {
		try {
			connection = MyDBConnection.getMyDbConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from hexaemp");
			while (rs.next()) {
				System.out.println("EmpNO  : " + rs.getInt(1));
				System.out.println("EmpName  : " + rs.getString(2));
				
//				Employee e = new Employee();
//				e.setEmpno(rs.getInt(1));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void updateEmployee(Employee emp) {
		try {
			connection = MyDBConnection.getMyDbConnection();
			ps = connection.prepareStatement("update hexaemp set ename=? where empno=?");
			ps.setString(1, emp.getEname());
			ps.setInt(2, emp.getEmpno());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " updated successfully !!!");
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteEmployee(int eno) {
		try {
			connection = MyDBConnection.getMyDbConnection();
			ps = connection.prepareStatement("delete from hexaemp where empno=?");
			ps.setInt(1, eno);
			int noofrows = ps.executeUpdate();
			System.out.println(eno + " deleted successfully !!!");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}

}
