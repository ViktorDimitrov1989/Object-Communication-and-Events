package eventImplementation.implementations;

import eventImplementation.contracts.NameChangeListener;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private String name;
    private List<NameChangeListener> listenerList;
    private Handler handler;

    public Dispatcher() {
        this.listenerList = new ArrayList<>();
        this.handler = new Handler();
    }

    public void setName(String name){
        if(name != null && name.length() > 0){
            this.fireNameChangeEvent(new NameChange(name));
            this.name = name;
        }
    }

    public void addNameChangeListener(NameChangeListener listener){
        this.listenerList.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener){
        if(this.listenerList.contains(listener)){
            this.listenerList.remove(listener);
        }
    }

    public void fireNameChangeEvent(NameChange nameChange){
        for (NameChangeListener nameChangeListener : this.listenerList) {
            nameChangeListener.handleChangedName(nameChange.getChangedName());
        }
    }

}
