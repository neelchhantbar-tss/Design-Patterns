package com.tss.simUduck.Ducks;

import com.tss.simUduck.Duck;
import com.tss.simUduck.flyBehaviours.FlyNoWay;
import com.tss.simUduck.flyBehaviours.FlyWithWings;
import com.tss.simUduck.quackBehaviours.Quack;
import com.tss.simUduck.quackBehaviours.Squeak;

public class MallardDuck extends Duck {

    public MallardDuck(){
        setQuackBehaviour(new Squeak());
        setFlyBehaviour(new FlyWithWings());
    }
    @Override
    public void display() {
        System.out.println("I'm Mallard Duck !");
    }
}
