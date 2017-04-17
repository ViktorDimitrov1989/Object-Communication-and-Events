package workForce.models.employee;

public abstract class Employee {
    private String name;
    private int workingHours;

    public Employee(String name, int workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    public int getWorkingHours(){
        return this.workingHours;
    }
}
