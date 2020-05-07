package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"12345678963", "John", "Smith"},
            {"78965412365", "Ivone", "Novak"},
            {"02589632156", "Jessie", "Pinkman"},
            {"75321456987", "Walter", "White"},
            {"02365414789", "Clara", "Lanson"}
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00
    };
    private String getWorker(int n) {
        if(n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
