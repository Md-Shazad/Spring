package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingSINGLE.Repository;


import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingSINGLE.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer>
{

}
