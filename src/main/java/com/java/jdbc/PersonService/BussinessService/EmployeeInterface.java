package com.java.jdbc.PersonService.BussinessService;

import com.java.jdbc.PersonService.Entity.Employee;
import com.java.jdbc.PersonService.Entity.Employees;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.sql.SQLException;


@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface EmployeeInterface {

    @WebMethod
    Employees getAllEmployees() throws SQLException;
}
