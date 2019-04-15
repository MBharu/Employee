package demo.mongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import demo.mongodb.model.Employee;



@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String>{

}


