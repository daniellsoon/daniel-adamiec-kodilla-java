package com.kodilla.hibernate.manytomany.facade;

public class FacadeException extends Exception {


    public static String ERR_COMPANY_NOT_FOUND = "Cannot find company!";
    public static String ERR_EMPLOYEE_NOT_FOUND = "Cannot find Employee!";

    public FacadeException(String message) {
        super(message);
    }

}
