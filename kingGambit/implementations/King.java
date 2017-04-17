package kingGambit.implementations;

import kingGambit.contracts.Attackable;
import kingGambit.contracts.Observer;
import kingGambit.contracts.Subject;

import java.util.ArrayList;
import java.util.List;

public class King extends Hero implements Subject, Attackable{
    private List<Observer> observers;

    public King(String name) {
        super(name);
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(String observerName) {
        for (Observer observer : this.observers) {
            if(observer.toString().equals(observerName)){
                this.observers.remove(observer);
                break;
            }
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public void takeAttack() {
        System.out.println(String.format("IKing %s is under attack!", super.getName()));
        this.notifyObservers();
    }
}
