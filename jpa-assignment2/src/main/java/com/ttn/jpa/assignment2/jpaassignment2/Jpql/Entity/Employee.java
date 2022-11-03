package com.ttn.jpa.assignment2.jpaassignment2.Jpql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @Column(name="empId")
    private int id;
    @Column(name="empFirstName")
    private String firstName;
    @Column(name="empLastName")
    private String lastName;
    @Column(name="empSalary")
    private int salary;
    @Column(name="empAge")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "empId=" + id +
                ", empFirstName='" + firstName + '\'' +
                ", empLastName='" + lastName + '\'' +
                ", empSalary=" + salary +
                ", empAge=" + age +
                '}';
    }
}
