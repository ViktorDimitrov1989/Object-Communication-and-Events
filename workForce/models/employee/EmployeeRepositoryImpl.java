package workForce.models.employee;

import workForce.contracts.EmployeeRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private Map<String, Employee> employees;


    public EmployeeRepositoryImpl() {
        this.employees = new HashMap<>();
    }


    @Override
    public void addEmployee(String name, Employee employee) {
        this.employees.put(name, employee);
    }

    @Override
    public Employee getEmployee(String name) {
        return this.employees.get(name);
    }
}
