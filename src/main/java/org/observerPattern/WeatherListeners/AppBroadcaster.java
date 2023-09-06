package org.observerPattern.WeatherListeners;

import org.observerPattern.Observable;
import org.observerPattern.Weather;

public class AppBroadcaster implements Observer{
    @Override
    public void update(Observable updatedObject) {
        Weather updatedWeatherInst = (Weather)updatedObject;
        System.out.println("App : Temperature changed to "+((Weather) updatedObject).getTemperature());
    }
}
