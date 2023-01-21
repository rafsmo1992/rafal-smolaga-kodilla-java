package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class FacadeSearchServiceTestSuite {

    @Autowired
    private Facade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testCompanyFacade() {
        companyDao.deleteAll();
        //Given
        Company company = new Company("Company1");
        Company company1 = new Company("Company2");
        Company company2 = new Company("Company3");
        Company company3 = new Company("Company4");

        //When
        companyDao.save(company);
        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        long c = company.getId();
        long c1 = company1.getId();
        long c2 = company2.getId();
        long c3 = company3.getId();

        List<Company> companies = facade.findForCompanyName("m");

        //Then
        try {
            assertEquals(4, companies.size());
        } finally {
            //CleanUp
            companyDao.deleteAll();
        }
    }

    @Test
    void testEmployeeFacade() {
        companyDao.deleteAll();
        //Given
        Employee employee = new Employee("firstname1", "lastname1");
        Employee employee1 = new Employee("firstname2", "lastname2");
        Employee employee2 = new Employee("firstname3", "lastname3");
       // Employee employee3 = new Employee("firstname4", "lastname4");

        //When
        employeeDao.save(employee);
        employeeDao.save(employee1);
        employeeDao.save(employee2);
        //employeeDao.save(employee3);

        long c = employee.getId();
        long c1 = employee1.getId();
        long c2 = employee2.getId();
      //  long c3 = employee3.getId();

        List<Employee> employees = facade.findForEmployeeName("lastname");

        //Then
        try {
            assertEquals(3, employees.size());
        } finally {
            //CleanUp
            employeeDao.deleteAll();
        }
    }
}