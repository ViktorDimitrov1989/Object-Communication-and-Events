package workForce;

import workForce.contracts.EmployeeRepository;
import workForce.contracts.Mediator;
import workForce.models.business.Business;
import workForce.models.employee.Employee;
import workForce.models.employee.EmployeeRepositoryImpl;
import workForce.models.employee.PartTimeEmployee;
import workForce.models.employee.StandartEmployee;
import workForce.models.job.JobImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        EmployeeRepository employeeRepo = new EmployeeRepositoryImpl();
        Mediator business = new Business();

        String line;
        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");


            switch (tokens[0].toLowerCase()) {
                case "job":
                    String name = tokens[1];
                    int workHours = Integer.parseInt(tokens[2]);
                    Employee employee = employeeRepo.getEmployee(tokens[3]);

                    business.registerObserver(new JobImpl(name, workHours, employee));
                    break;
                case "standartemployee":
                    employeeRepo.addEmployee(tokens[1], new StandartEmployee(tokens[1]));
                    break;
                case "parttimeemployee":
                    employeeRepo.addEmployee(tokens[1], new PartTimeEmployee(tokens[1]));
                    break;
                case "pass":
                    business.notifyObservers();
                    break;
                case "status":
                    business.printStatus();
                    break;
                    default:
                        break;
            }
        }

    }
}
