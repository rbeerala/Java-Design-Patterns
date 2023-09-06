package org.strategyDesign;

import org.strategyDesign.strategy.DriveStrategy;
import org.strategyDesign.strategy.SpecialDriveStrategy;

public class OffroadVechile extends Vechile{
    public OffroadVechile(){
        super(new SpecialDriveStrategy());
    }
}
