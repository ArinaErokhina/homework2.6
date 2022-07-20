package com.homework26.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/add")
    public Employee addEmployee(@RequestParam(name = "nameEmployee") String nameEmployee, @RequestParam(name = "surnameEmployee") String surnameEmployee) {
        Employee employee = new Employee(nameEmployee, surnameEmployee);
        return employeeService.addEmployee(employee);
    }

    @GetMapping(path = "/remove")
    public Employee deleteEmployee(@RequestParam(name = "nameEmployee") String nameEmployee, @RequestParam(name = "surnameEmployee") String surnameEmployee) {
        Employee employee = new Employee(nameEmployee, surnameEmployee);
        return employeeService.deleteEmployee(employee);
    }

    @GetMapping(path = "/find")
    public Employee findEmployee(@RequestParam(name = "nameEmployee") String nameEmployee, @RequestParam(name = "surnameEmployee") String surnameEmployee) {
        Employee employee = new Employee(nameEmployee, surnameEmployee);
        return employeeService.findEmployee(nameEmployee);
    }

    @GetMapping(path = "/all")
    public Map<String, Employee> allEmployee() {
        return employeeService.allEmployee();
    }


}
