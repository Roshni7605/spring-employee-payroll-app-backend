/* EmployeePayrollData.java */
package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//@Entity
//@Table(name = "employee_payroll")
public @Data class EmployeePayrollData {
    private int employeeId;

    //@Column(name = "name")
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    private List<String> department;

    public EmployeePayrollData() {}

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.updateEmployeePayrollData(empPayrollDTO);
    }

    public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
        this.gender = empPayrollDTO.gender;
        this.note = empPayrollDTO.note;
        this.startDate = empPayrollDTO.startDate;
        this.profilePic = empPayrollDTO.profilePic;
        this.department = empPayrollDTO.department;
    }
}
