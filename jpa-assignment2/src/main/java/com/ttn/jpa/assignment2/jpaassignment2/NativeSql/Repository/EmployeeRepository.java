package com.ttn.jpa.assignment2.jpaassignment2.NativeSql.Repository;




  import com.ttn.jpa.assignment2.jpaassignment2.NativeSql.Entity.Employee;
  import org.springframework.data.jpa.repository.Modifying;
 import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
 import org.springframework.stereotype.Repository;

 import java.util.List;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{
   @Query(value=" select empId, empFirstName,empAge from employee where empLastName Like \"%singh\"", nativeQuery = true)
   List<Object[]> findByLastNameEnds();


   @Modifying
   @Query(value= "DELETE FROM employee where empAge > :ageGiven",nativeQuery = true)
   void deleteEmpWithAgeGreat(@Param("ageGiven") int ageGiven);


}
