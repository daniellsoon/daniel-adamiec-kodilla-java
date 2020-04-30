package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private static final  Logger LOGGER = LoggerFactory.getLogger(FacadeException.class);

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public List<Company> getCompanyContains(String partialName) throws FacadeException {
        List<Company> foundedCompanies = companyDao.retrieveCompaniesContains(partialName);
        boolean wasError = false;
        LOGGER.info("Starting searching companies contains: " + partialName);
        if(foundedCompanies.isEmpty()) {
            LOGGER.error(FacadeException.ERR_COMPANY_NOT_FOUND);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_COMPANY_NOT_FOUND);
        } else {
            return foundedCompanies;
        }
    }

    public List<Employee> getEmployeeLastNameContains(String partialName) throws FacadeException {
        List<Employee> foundedEmployees = employeeDao.retrieveWorkersLastNameContains(partialName);
        boolean wasError = false;
        LOGGER.info("Starting searching employees contains: " + partialName);
        if(foundedEmployees.isEmpty()) {
            LOGGER.error(FacadeException.ERR_EMPLOYEE_NOT_FOUND);
            wasError = true;
            throw new FacadeException(FacadeException.ERR_EMPLOYEE_NOT_FOUND);
        } else {
            return foundedEmployees;
        }
    }


}
