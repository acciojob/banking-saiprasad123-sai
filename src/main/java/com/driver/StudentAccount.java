package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        super(name,balance,0);
        //minimum balance is 0 by default

    }

    public StudentAccount(String name, double balance, double minBalance, String institutionName) {
        super(name, balance, minBalance);
        this.institutionName = institutionName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }
}
