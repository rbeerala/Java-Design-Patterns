package org.observerPattern.WeatherListeners;

import org.observerPattern.Observable;

public interface Observer {
    public void update(Observable updatedObject);
}
