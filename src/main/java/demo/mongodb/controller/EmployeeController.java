package demo.mongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.mongodb.dal.EmployeeRepository;
import demo.mongodb.model.Employee;

@RestController
@RequestMapping(value = "/employee")

public class EmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private EmployeeRepository employeeRepository;


@RequestMapping(value = "/all", method = RequestMethod.GET)
public List<Employee> getAllEmployees() {
	LOG.info("Getting all employees.");
	return employeeRepository.findAll();
}


/* @RequestMapping(value = "/{ID}", method = RequestMethod.GET)
public Student getStudent(@PathVariable String ID) {
	LOG.info("Getting student with ID: {}.", ID);
	return studentRepository.findById(ID);
} */


@RequestMapping(value = "/create", method = RequestMethod.POST)
public Employee addNewEmployees(@RequestBody Employee employee) {
	LOG.info("Saving employee.");
	return employeeRepository.save(employee);
}


}





