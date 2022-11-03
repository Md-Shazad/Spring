package com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Repository;


import com.ttn.jpa.assignment2.jpaassignment2.InheritanceMappingJoined.Entity.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments,Integer>
{

}
