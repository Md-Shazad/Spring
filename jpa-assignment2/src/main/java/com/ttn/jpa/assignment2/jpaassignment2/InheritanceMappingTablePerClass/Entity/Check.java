package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cheque")
public class Check extends Payment
{
    private String checknumber;

    public String getChecknumber()
    {
        return checknumber;
    }

    public void setChecknumber(String checknumber)
    {
        this.checknumber = checknumber;
    }
}
