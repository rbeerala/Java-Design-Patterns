package org.observerPattern;

import org.observerPattern.WeatherListeners.AppBroadcaster;
import org.observerPattern.WeatherListeners.TvBroadcaster;

public class Main {
    public static void main(String[] args) {
        Weather weatherObj = new Weather();
        weatherObj.setTemperature(82);
        TvBroadcaster tvBroad = new TvBroadcaster();
        AppBroadcaster appBroad = new AppBroadcaster();

        weatherObj.addListener(tvBroad);
        weatherObj.addListener(appBroad);

        weatherObj.setTemperature(87);
    }
}
