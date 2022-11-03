package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Entity;

//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.*;

@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
public class Card extends Payments
{
    private String cardnumber;

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
