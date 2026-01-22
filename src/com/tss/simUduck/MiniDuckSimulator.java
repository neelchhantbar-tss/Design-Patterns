package com.tss.simUduck;

import com.tss.simUduck.Ducks.MallardDuck;
import com.tss.simUduck.Ducks.ModelDuck;
import com.tss.simUduck.flyBehaviours.FlyRocketPowered;
import com.tss.simUduck.flyBehaviours.FlyWithWings;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
