package workForce.models.employee;

public class PartTimeEmployee extends Employee{
    private static final int WORKING_HOURS_PER_WEEK = 20;

    public PartTimeEmployee(String name) {
        super(name, WORKING_HOURS_PER_WEEK);
    }


}
