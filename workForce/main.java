package workForce;

import contracts.EmployeeRepository;
import contracts.Mediator;
import models.business.Business;
import models.employee.Employee;
import models.employee.EmployeeRepositoryImpl;
import models.employee.PartTimeEmployee;
import models.employee.StandartEmployee;
import models.job.JobImpl;

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
