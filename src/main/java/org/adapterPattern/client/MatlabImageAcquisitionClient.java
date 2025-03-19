package org.adapterPattern.client;

import org.adapterPattern.adapter.CameraAdapter;
import org.adapterPattern.adapter.WebCamAdapter;

/**
 * In Adapter pattern, for example in MATLAB, we have multiple adapters
 * each corresponding to a different camera interface.
 * Core functions like getSnapshot(),getData(),start() etc. all talk to the configured adapter
 * with the same signature.
 * Ex: getSnapShot() -> internally calls camera interface functions initCam(),grabFrame(),convertFrame()
 * All the above 3 calls will be the same to all adapters
 * i.e Camera Adapter1, Adapter2 ... Adaptern will have to implement the functions
 * initCam(),grabFrame(),convertFrame() and write their own impl specific to the cam.
 *
 *    CameraAdapter  <- CamAdapter1
 *    ^        ^
 *    |        |
 *  CamAdapter2  CamAdapter3
 *
 */

public class MatlabImageAcquisitionClient {

    CameraAdapter camAdapter;
    /*
     * Constructor logic can be enhanced
     * to create a specific adapter based on the given config as input
     * instead of the object itself
     */
    MatlabImageAcquisitionClient(CameraAdapter adapter){
        this.camAdapter = adapter;
    }

    /**
     * Example method/feature of toolbox that depends on adapter impl
     */
    public String getSnapshot(){
        // setup cam first
        camAdapter.setupCamConfig();
        camAdapter.getFrame();
        return camAdapter.convertFrame();
    }

    /**
     * Demonstrates how the image acquisition toolbox is used by MATLAB clients
     * @param args
     */
    public static void main(String[] args) {
        // Not the ideal flow to deal with the adapter manually
        // Client should create based on the config provided
        CameraAdapter adapter = new WebCamAdapter();
        // TODO: Change initializations as follows:
        // MatlabImageAcquisitionClient imaq = new MatlabImageAcquisitionClient('webcam');
        MatlabImageAcquisitionClient imaq = new MatlabImageAcquisitionClient(adapter);
        System.out.println(imaq.getSnapshot());
    }

}
