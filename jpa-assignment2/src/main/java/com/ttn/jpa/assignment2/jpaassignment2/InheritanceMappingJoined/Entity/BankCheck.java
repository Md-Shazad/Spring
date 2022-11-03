package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "bankcheck")
@PrimaryKeyJoinColumn(name = "id")
public class BankCheck extends Payments
{
    private String checknumber;

    public String getChecknumber() {
        return checknumber;
    }

    public void setChecknumber(String checknumber) {
        this.checknumber = checknumber;
    }
}
