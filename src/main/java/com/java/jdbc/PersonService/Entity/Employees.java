package com.java.jdbc.PersonService.Entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlRootElement
public class Employees {
    private List<Employee> employee;
    @XmlElement
    public List<Employee> getEmployees() {
        return employee;
    }

    public void setEmployees(List<Employee> employees) {
        this.employee = employees;
    }
}
