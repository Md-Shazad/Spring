package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Repository;


import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingTablePerClass.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Integer>
{

}
