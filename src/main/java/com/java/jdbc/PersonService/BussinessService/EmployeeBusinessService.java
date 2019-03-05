package com.java.jdbc.PersonService.BussinessService;

import com.java.jdbc.PersonService.DALObjects.EmployeeImpl;
import com.java.jdbc.PersonService.Entity.Employee;
import com.java.jdbc.PersonService.Entity.Employees;

import javax.jws.WebService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.java.jdbc.PersonService.BussinessService.EmployeeInterface")
public class EmployeeBusinessService implements EmployeeInterface {

    @Override
    public Employees getAllEmployees() throws SQLException {
        Employees employees;
        EmployeeImpl empImp=new EmployeeImpl();
        employees=empImp.getEmployees();
        return employees;
    }

}
