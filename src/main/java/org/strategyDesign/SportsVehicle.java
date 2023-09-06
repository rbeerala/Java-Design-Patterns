package org.strategyDesign;

import org.strategyDesign.strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vechile{
    public SportsVehicle(){
        super(new SpecialDriveStrategy());
    }
}
