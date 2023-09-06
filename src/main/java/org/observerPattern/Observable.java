package org.observerPattern;

import org.observerPattern.WeatherListeners.Observer;

public interface Observable {
    public void addListener(Observer obj);
    public void removeListener(Observer obj);
    public void notifyListeners();
}
