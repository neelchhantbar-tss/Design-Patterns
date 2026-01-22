package com.tss.simUduck;

import com.tss.simUduck.quackBehaviours.Quack;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(){

    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }
    public FlyBehaviour getFlyBehaviour(){
        return flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    public QuackBehaviour getQuackBehaviour(){
        return quackBehaviour;
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("Floating!");
    }
}
