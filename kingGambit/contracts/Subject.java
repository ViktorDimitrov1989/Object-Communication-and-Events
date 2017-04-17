package kingGambit.contracts;

public interface Subject {

    void register(Observer observer);

    void unregister(String observer);

    void notifyObservers();
}
