package org.observerPattern;

import org.observerPattern.WeatherListeners.Observer;

import java.util.LinkedList;
import java.util.List;

public class SomeOtherClass implements Observable{

    List<Observer> classObservers;
    private int data;

    public SomeOtherClass(){
        classObservers = new LinkedList<>();
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        notifyListeners();
    }


    @Override
    public void addListener(Observer obj) {
        classObservers.add(obj);
    }

    @Override
    public void removeListener(Observer obj) {
        classObservers.remove(obj);
    }

    @Override
    public void notifyListeners() {
        for (Observer listener: classObservers
             ) {
            listener.update(this);
        }
    }
}
