package com.rupesh.singleton;

public class Singleton {
    private  Singleton(){

    }
    static Singleton instances;

    public static Singleton getInstances() {
        //check weather the instances is created or not 
        if(instances == null){
            instances = new Singleton();
        }
        return instances;
    }
}