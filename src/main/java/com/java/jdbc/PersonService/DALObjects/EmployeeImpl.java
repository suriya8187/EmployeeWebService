package com.java.jdbc.PersonService.DALObjects;

import com.java.jdbc.PersonService.Entity.Employee;
import com.java.jdbc.PersonService.Entity.Employees;
import com.java.jdbc.PersonService.helpers.JDBCHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeImpl {
    public static void main(String[] args ){
        try {
            EmployeeImpl em=new EmployeeImpl();
            em.getEmployees();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employees getEmployees() throws SQLException {
        Employee employee=new Employee();
        Employees employees=new Employees();
        List<Employee> employeelist=new ArrayList<Employee>();
        Statement stmt=null;
        Connection con=JDBCHelper.getConnection();
        System.out.println("Connection Established");
        System.out.println("-----------------------------");
        stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery( "SELECT * FROM HR.EMPLOYEES" );
          while(rs.next()){
            System.out.println("Employee id" +"\t"+rs.getString("EMPLOYEE_ID"));
              employee.setEmployeeId(rs.getLong("EMPLOYEE_ID"));
              employee.setFirstName(rs.getString("FIRST_NAME"));
              employee.setLastName(rs.getString("LAST_NAME"));
              employee.setLastName(rs.getString("LAST_NAME"));
              employee.setEmail(rs.getString("EMAIL"));
              employee.setPhoneNumber(rs.getString("PHONE_NUMBER"));
              employee.setHireDate(rs.getDate("HIRE_DATE"));
              employee.setJobId(rs.getString("JOB_ID"));
              employee.setSalary(rs.getFloat("SALARY"));
              employee.setCommissionPct(rs.getFloat("COMMISSION_PCT"));
              employee.setManagerId(rs.getLong("MANAGER_ID"));
              employee.setDepartmentId(rs.getLong("DEPARTMENT_ID"));
              employeelist.add(employee);
          }
          employees.setEmployees(employeelist);
        return employees;
    }

}
