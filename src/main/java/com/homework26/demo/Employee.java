package com.homework26.demo;

import java.util.Objects;

public class Employee {
    private String nameEmployee;
    private String surnameEmployee;


    public Employee(String nameEmployee, String surnameEmployee) {
        this.nameEmployee = nameEmployee;
        this.surnameEmployee = surnameEmployee;
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }

    public String getSurnameEmployee() {
        return this.surnameEmployee;
    }

    @Override
    public String toString() {
        return "Ф.И.О: " + surnameEmployee + " " + nameEmployee + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return nameEmployee.equals(employee.nameEmployee) && surnameEmployee.equals(employee.surnameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEmployee, surnameEmployee);
    }
}
