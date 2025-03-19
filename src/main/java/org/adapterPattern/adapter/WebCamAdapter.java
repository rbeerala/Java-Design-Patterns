package org.adapterPattern.adapter;

import org.adapterPattern.drivers.WebCamDriver;

/**
 * Web cam adapter implementing methods specific to web cam
 * Holds a member instance of WebCam Driver that it communicates to
 * to do things accordingly
 */
public class WebCamAdapter implements CameraAdapter{

    WebCamDriver driverObj;
    public WebCamAdapter(){
        driverObj = new WebCamDriver();
    }

    @Override
    public void setupCamConfig() {
        System.out.println("Web cam config init");
    }

    @Override
    public void getFrame() {
        // Call driverObj.grabFrame() for example
        System.out.println("Web cam get frame");
    }

    @Override
    public String convertFrame() {
        System.out.println("Web cam get frame");
        return "Web cam frame";
    }
}
