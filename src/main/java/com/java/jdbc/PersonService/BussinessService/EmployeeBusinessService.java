package com.java.jdbc.PersonService.BussinessService;

import com.java.jdbc.PersonService.DALObjects.EmployeeImpl;
import com.java.jdbc.PersonService.Entity.Employee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import java.sql.SQLException;
import java.util.List;

@WebService(targetNamespace = "http://com.java.maven.BusinessService.EmployeeBusinessService")
public class EmployeeBusinessService {

    @WebMethod
    @WebResult(name="Employee")
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employeelist;
        EmployeeImpl empImp=new EmployeeImpl();
        employeelist=empImp.getEmployees();
        System.out.println(employeelist.size());
        return employeelist;
    }

    @WebMethod
    @WebResult(name="Employee")
    public Employee getEmployeeById(@WebParam(name = "EmployeeID") Long EmployeeID) throws SQLException {
        Employee employee =new Employee();
        EmployeeImpl empImp=new EmployeeImpl();
        employee=empImp.getEmployeesById(EmployeeID);
        return employee;
    }

}
