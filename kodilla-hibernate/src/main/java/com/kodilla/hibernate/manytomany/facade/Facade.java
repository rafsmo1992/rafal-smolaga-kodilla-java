package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    @Autowired
    private final CompanyDao companyDao;
    @Autowired
    private final EmployeeDao employeeDao;

    public Facade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Employee> findForEmployeeName(String name) {
        return employeeDao.findEmployeesWithNameThatContains(name);
    }

    public List<Company> findForCompanyName(String name) {
        return companyDao.findCompaniesWithNameThatContains(name);
    }

}