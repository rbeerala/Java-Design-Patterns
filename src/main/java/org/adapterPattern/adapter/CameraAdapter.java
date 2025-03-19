package org.adapterPattern.adapter;

/**
 * Minimal Camera Adapter Interface that defines the core functionality that is to be implemented by
 * each of the camera adapters.
 */
public interface CameraAdapter {

    void setupCamConfig();
    void getFrame();
    String convertFrame();

}
