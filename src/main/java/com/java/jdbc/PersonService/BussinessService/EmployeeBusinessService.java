package com.java.jdbc.PersonService.BussinessService;

import com.java.jdbc.PersonService.DALObjects.EmployeeImpl;
import com.java.jdbc.PersonService.Entity.Employee;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.java.jdbc.PersonService.BussinessService.EmployeeBusinessService")
public class EmployeeBusinessService {

    @WebMethod
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employees=new ArrayList<Employee>();
        EmployeeImpl empImp=new EmployeeImpl();
        employees=empImp.getEmployees();
        return employees;
    }
    public static void main(String [] args){
        Endpoint.publish("http://localhost:9990/EmployeeBusinessService", new EmployeeBusinessService());

        System.out.println("EmployeeLookupService Started!");
    }
}
