package com.ttn.bootcamp.restful.assignment.restfulassignment.services;

import com.ttn.bootcamp.restful.assignment.restfulassignment.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    List<Employee> list;

    public EmployeeServiceImplementation() {
        list = new ArrayList<>();
        list.add(new Employee(1,"Harsh",19));
        list.add(new Employee(2,"Ankit",20));
        list.add(new Employee(3,"Vidhayak",22));

    }

    @Override
    public List<Employee> getEmployees(){
        return list;
    };
    @Override
    public Employee getEmployee(int id){
        Employee emp = null;
        for(Employee e:list){
            if(id==e.getId()) {
                emp =e;
                break;
            }
        }
        return emp;
    };
    @Override
    public void addEmployee(Employee employee){
        list.add(employee);
    };
    @Override
    public void deleteEmployee(int id){
        /*List<Employee> rmvList = new ArrayList<>();
        Employee emp = null;
        Iterator<Employee> itr = list.iterator();
        while(itr.hasNext()){
            if(itr.next().getId()==id){ //took a list and getting the id of item using iterator and comparing with id we wanna delete
                rmvList.add(itr.next());// if matched add that to rmvList
                emp = itr.next();//and store it in the emp which will be sent later
                list.removeAll(rmvList);//now using removeAll method and passing rmvList the items in the list
                //will be removed from the list in which we were looking for id
            }
        }*/
        Predicate<? super Employee> predicate = employee -> employee.getId().equals(id);

        list.removeIf(predicate);
    };
}
