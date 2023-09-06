package org.strategyDesign;

import org.strategyDesign.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vechile{
    public PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
