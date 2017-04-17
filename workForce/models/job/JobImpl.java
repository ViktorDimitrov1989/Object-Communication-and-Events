package workForce.models.job;

import workForce.contracts.Job;
import workForce.models.employee.Employee;

public class JobImpl implements Job{
    private Employee employee;
    private String name;
    private int hoursOfWorkRequired;

    public JobImpl(String name, int hoursOfWorkRequired, Employee employee) {
        this.employee = employee;
        this.name = name;
        this.hoursOfWorkRequired = hoursOfWorkRequired;
    }

    @Override
    public void update(){
        this.hoursOfWorkRequired -= this.employee.getWorkingHours();
    }

    @Override
    public int getHoursWorkRequired() {
        return this.hoursOfWorkRequired;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("Job: %s Hours Remaining: %d", this.name, this.hoursOfWorkRequired);
    }
}
