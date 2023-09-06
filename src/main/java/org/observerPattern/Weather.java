package org.observerPattern;

import org.observerPattern.WeatherListeners.Observer;

import java.util.LinkedList;
import java.util.List;

public class Weather implements Observable{
    private double temperature;
    List<Observer> weatherListeners;

    public Weather(){
        weatherListeners = new LinkedList<>();
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifyListeners();
    }

    public double getTemperature(){
        return temperature;
    }

    @Override
    public void addListener(Observer obj) {
        weatherListeners.add(obj);
    }

    @Override
    public void removeListener(Observer obj) {
        weatherListeners.remove(obj);
    }

    @Override
    public void notifyListeners() {
        for (Observer listener: weatherListeners
             ) {
            listener.update(this);
        }
        System.out.println("Notified "+weatherListeners.size()+" listeners");
    }
}
