package org.strategyDesign;

import org.strategyDesign.strategy.DriveStrategy;

public class Vechile {
    DriveStrategy driveStrategy;

    Vechile(DriveStrategy dsObject){
        driveStrategy = dsObject;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
