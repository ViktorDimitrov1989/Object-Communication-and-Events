package workForce.models.employee;

public class StandartEmployee extends Employee{
    private static final int WORKING_HOURS_PER_WEEK = 40;

    public StandartEmployee(String name) {
        super(name, WORKING_HOURS_PER_WEEK);
    }


}
