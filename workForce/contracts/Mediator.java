package workForce.contracts;

import models.job.JobImpl;

public interface Mediator {

    void registerObserver(Job job);

    void unregisterObserver(Job job);

    void notifyObservers();

    void printStatus();
}
