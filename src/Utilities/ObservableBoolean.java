package Utilities;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dante
 */
public class ObservableBoolean {

    // "CopyOnWrite" to avoid concurrent modification exceptions in loop below.
    private final List<ChangeListener> listeners =
            new CopyOnWriteArrayList<ChangeListener>();

    private boolean value;

    public boolean getValue() {
        return value;
    }

    public synchronized void setValue(boolean b) {
        value = b;
        for (ChangeListener cl : listeners)
            cl.stateChanged(new ChangeEvent(this));
    }

    public synchronized void addChangeListener(ChangeListener cl) {
        listeners.add(cl);
    }

    public synchronized void removeChangeListener(ChangeListener cl) {
        listeners.remove(cl);
    }
}    
