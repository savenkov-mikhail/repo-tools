package com.savemik.tools.dao;

import com.savemik.tools.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
