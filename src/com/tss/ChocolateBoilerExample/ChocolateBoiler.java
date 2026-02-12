package com.tss.ChocolateBoilerExample;

public class ChocolateBoiler {
    private boolean empty, boiled;
    private static ChocolateBoiler chocolateBoilerInstance = null;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if(chocolateBoilerInstance == null){
            chocolateBoilerInstance = new ChocolateBoiler();
        }
        return chocolateBoilerInstance;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
}
