package com.savemik.tools;

import com.savemik.tools.dao.EmployeeDao;
import com.savemik.tools.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootStarter {

    private final EmployeeDao employeeDao;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class, args);
    }

    @Autowired
    public SpringBootStarter(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/getEmployee")
    public String getEmployee() {
        List<Employee> allEmployees = employeeDao.getAllEmployees();
        StringBuilder output = new StringBuilder("Employee list:\n");

        for (Employee emp: allEmployees) {
            output.append(emp.toString());
        }
        return output.toString();
    }
}
