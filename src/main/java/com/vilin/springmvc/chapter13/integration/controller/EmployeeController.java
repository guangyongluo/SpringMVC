package com.vilin.springmvc.chapter13.integration.controller;

import com.vilin.springmvc.chapter13.integration.domain.Employee;
import com.vilin.springmvc.chapter13.integration.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;
	
	@RequestMapping(value="/highest-paid/{category}")
    public String getHighestPaid(@PathVariable int category, Model model) {
        Employee employee = employeeService.getHighestPaidEmployee(category);
        model.addAttribute("employee", employee);
        return "success";
    }
}