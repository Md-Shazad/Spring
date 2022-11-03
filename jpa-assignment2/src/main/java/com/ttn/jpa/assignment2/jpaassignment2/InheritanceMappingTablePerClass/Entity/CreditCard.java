package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard extends Payment
{
    private String cardnumber;

    public String getCardnumber()
    {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber)
    {
        this.cardnumber = cardnumber;
    }
}
