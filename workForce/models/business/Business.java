package workForce.models.business;

import workForce.contracts.Mediator;
import workForce.contracts.Job;

import java.util.ArrayList;
import java.util.List;

public class Business implements Mediator {
    private List<Job> jobs;

    public Business() {
        this.jobs = new ArrayList<>();
    }

    @Override
    public void registerObserver(Job job) {
        this.jobs.add(job);
    }

    @Override
    public void unregisterObserver(Job job) {
        this.jobs.remove(job);
    }

    @Override
    public void notifyObservers() {
        List<Job> jobsToRemove = new ArrayList<>();

        for (Job job: this.jobs) {
            job.update();
            if(job.getHoursWorkRequired() <= 0){
                System.out.println(String.format("Job %s done!", job.getName()));
                jobsToRemove.add(job);
            }
        }
        this.jobs.removeAll(jobsToRemove);
    }

    @Override
    public void printStatus() {
        for (Job job: this.jobs) {
            System.out.println(job);
        }
    }
}
