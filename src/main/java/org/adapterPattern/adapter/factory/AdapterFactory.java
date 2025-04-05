package org.adapterPattern.adapter.factory;

import org.adapterPattern.adapter.CameraAdapter;

public interface AdapterFactory {
    CameraAdapter getAdapter(String adapterName);
}
