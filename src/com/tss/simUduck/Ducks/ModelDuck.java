package com.tss.simUduck.Ducks;

import com.tss.simUduck.Duck;
import com.tss.simUduck.flyBehaviours.FlyNoWay;
import com.tss.simUduck.quackBehaviours.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm Model Duck!");
    }
}
