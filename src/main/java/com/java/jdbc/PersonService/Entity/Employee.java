package com.java.jdbc.PersonService.Entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;
@XmlRootElement(name = "Employee")
@XmlType(namespace = "http://com.java.maven.jdbc.Employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date hireDate;
    private String jobId;
    private Float salary;
    private Float commissionPct;
    private long managerId;
    private long departmentId;
    public Employee(){}
    public Employee(long employeeId,
            String firstName,
             String lastName,
             String email,
             String phoneNumber,
             Date hireDate,
             String jobId,
             Float salary,
             Float commissionPct,
             long managerId,
             long departmentId) {
        this.employeeId=employeeId;
         this.firstName=firstName;
          this.lastName=lastName;
         this.email=email;
         this.phoneNumber=phoneNumber;
         this.hireDate=hireDate;
        this.jobId=jobId;
         this.salary=salary;
         this.commissionPct=commissionPct;
         this.managerId=managerId;
         this.departmentId=departmentId;
    }


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Float getCommissionPct() {
        return commissionPct;
    }

    public void setCommissionPct(Float commissionPct) {
        this.commissionPct = commissionPct;
    }

    public long getManagerId() {
        return managerId;
    }

    public void setManagerId(long managerId) {
        this.managerId = managerId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }




}