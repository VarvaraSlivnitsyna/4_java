package org.example;

import java.math.BigInteger;

public class Company {
    public Integer id, employeeCount;
    public BigInteger marketCap;
    public String name, address, domain, logo, ceoName,
            zip, country, industry;
    public void print()
    {
        System.out.println("id: " + this.id + "\n name: " + this.name+"\n address: " +
                this.address + "\n zip: " + this.zip + "\n country: " + this.country
                + "\n employeeCount: " + this.employeeCount + "\n industry: " + this.industry + "\n marketCap: " + this.marketCap
                + "\n domain: " + this.domain + "\n logo: " + this.logo + "\n ceoName: " +
                this.ceoName + "\n");
    }
}