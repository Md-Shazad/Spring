package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Entity;

import javax.persistence.*;

@Entity
@Table(name = "payments")
@Inheritance(strategy = InheritanceType.JOINED)
public class Payments
{
    @Id
    private int id;
    private double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
