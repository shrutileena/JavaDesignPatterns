package org.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class TrafficUpdates implements PropertyChangeListener {
    private ArrayList<String> trafficUpdates = new ArrayList<>();
    public void getUpdates(){
        trafficUpdates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        trafficUpdates.add((String) evt.getNewValue());
    }
}
