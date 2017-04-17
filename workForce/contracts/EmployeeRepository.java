package workForce.contracts;

import workForce.models.employee.Employee;

public interface EmployeeRepository {

    void addEmployee(String name, Employee employee);

    Employee getEmployee(String name);

}
