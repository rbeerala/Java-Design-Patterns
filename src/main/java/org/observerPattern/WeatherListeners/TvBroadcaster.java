package org.observerPattern.WeatherListeners;

import org.observerPattern.Observable;
import org.observerPattern.Weather;

public class TvBroadcaster implements Observer {
    @Override
    public void update(Observable updatedObject) {
        Weather updatedWeatherInst = (Weather)updatedObject;
        System.out.println("Tv : Temperature changed to "+((Weather) updatedObject).getTemperature());
    }
}
