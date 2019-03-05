package com.java.jdbc.PersonService.DALObjects;

import com.java.jdbc.PersonService.Entity.Employee;
import com.java.jdbc.PersonService.helpers.JDBCHelper;

import java.sql.*;
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

    public List<Employee> getEmployees() throws SQLException {
        Employee employee=new Employee();
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
              System.out.println(employeelist.size());
          }
          stmt.close();
          rs.close();
        con.close();
        return employeelist;
    }
    public Employee getEmployeesById(Long EmpID) throws SQLException {
        Employee employee=new Employee();
        PreparedStatement stmt=null;
        Connection con=JDBCHelper.getConnection();
        System.out.println("Connection Established");
        System.out.println("-----------------------------");
        stmt=con.prepareStatement("SELECT * FROM HR.EMPLOYEES WHERE EMPLOYEE_ID=?" );
        stmt.setLong(1,EmpID);

        ResultSet rs=stmt.executeQuery();
        if (rs.next()) {
            System.out.println("Employee id" + "\t" + rs.getString("EMPLOYEE_ID"));
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
        }
            stmt.close();
            rs.close();
            con.close();
            return employee;
    }
}
