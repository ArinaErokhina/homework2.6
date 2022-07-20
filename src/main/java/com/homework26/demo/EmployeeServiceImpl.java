package com.homework26.demo;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static Map<String, Employee> employees = new HashMap<>(Map.of(
            "Иван", new Employee("Иван", "Федоров"),
            "Алина", new Employee("Алина", "Смирнова"),
            "Егор", new Employee("Егор", "Прохоров"),
            "Роман", new Employee("Роман", "Григорьев"),
            "Вера", new Employee("Вера", "Кузнецова"),
            "Максим", new Employee("Максим", "Сидоров"),
            "Андрей", new Employee("Андрей", "Васильев"),
            "Валерия", new Employee("Валерия", "Коровина"),
            "Ivan", new Employee("Ivan", "Ivanov"),
            "Дмитрий", new Employee("Дмитрий", "Дробков")
    ));
    private static int maxEmployeeCount = 11;

    public Set<Employee> uniqueEmployee(Map<String, Employee> employees ){
        Set<Employee>uniqEmpl = new HashSet<>();
        for (Employee i : employees.values()) {
            uniqEmpl.add(i);
        }
        return uniqEmpl;
    }
    public Employee addEmployee(Employee employee) {
        if (employee.getNameEmployee() == null || employee.getSurnameEmployee() == null) {
            throw new EmployeeDataEnteredIncorrectlyException();
        }
        if (maxEmployeeCount == employees.size()) {
            throw new EmployeeStorageIsFullException();
        }
        for (int i = 0; i < employees.size(); i++) {
            if (employee.equals(employees.get(i))) {
                throw new EmployeeAlreadyAddedException();
            }
        }
        employees.put(employee.getNameEmployee(), employee);
        return employee;
    }

    public Employee deleteEmployee(Employee employee) {
        if (employee.getNameEmployee() == null || employee.getSurnameEmployee() == null) {
            throw new EmployeeDataEnteredIncorrectlyException();
        }
        for (int i = 0; i < employees.size(); i++) {
            if (employee.equals(employees.get(i)))
                return employees.remove(i);
        }
        throw new EmployeeNotFoundException();
    }

    public Employee findEmployee(String nameEmployee) {
        Employee employee = employees.get(nameEmployee);
        if (employee.getNameEmployee() == null || employee.getSurnameEmployee() == null) {
            throw new EmployeeDataEnteredIncorrectlyException();
        }
        if (employee.equals(employees.get(nameEmployee))) {
            return employees.get(nameEmployee);
        }

        throw new EmployeeNotFoundException();
    }

    public Map<String, Employee> allEmployee() {
        return employees;
    }


}


