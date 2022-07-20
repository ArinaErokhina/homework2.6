package com.homework26.demo;

import java.util.Map;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);

    public Employee deleteEmployee(Employee employee);

    public Employee findEmployee(String nameEmployee);

    public Map<String, Employee> allEmployee();
}
