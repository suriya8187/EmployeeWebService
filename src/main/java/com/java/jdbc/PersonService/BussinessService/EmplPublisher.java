package com.java.jdbc.PersonService.BussinessService;

import javax.xml.ws.Endpoint;

public class EmplPublisher                  {

    public static void main(String[] args) {

        Endpoint ep = Endpoint.create(new EmployeeBusinessService());
        ep.publish("http://localhost:8069/EmployeeBusinessService?wsdl");
        System.out.println("Webservice published");
    }
}

