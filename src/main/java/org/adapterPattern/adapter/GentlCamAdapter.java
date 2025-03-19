package org.adapterPattern.adapter;

import org.adapterPattern.drivers.GentlCameraDriver;

/* Gentl cam adapter implementing methods specific to cams following gentl standard
 * Holds a member instance of Gentl Driver that it communicates
 * to do things accordingly.
 */
public class GentlCamAdapter implements CameraAdapter{

     GentlCameraDriver driverObj;
     public GentlCamAdapter(){
         driverObj = new GentlCameraDriver();
     }
    @Override
    public void setupCamConfig() {
        System.out.println("Gentl cam config init");
    }

    @Override
    public void getFrame() {
        // Call driverObj.grabFrame() for example
        System.out.println("Gentl cam get frame");
    }

    @Override
    public String convertFrame() {
        System.out.println("Web cam get frame");
        return "Gentl cam frame";
    }
}
