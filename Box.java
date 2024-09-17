package com.rupesh.Properties.Inheritance;

public class Box {
    double length;
    double height;
    double weight;

    Box(double side) {
        this.length = side;
        this.height = side;
        this.weight = side;
    }
    Box( double length, double height, double weight){
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
    Box(Box oldBox){
        this.length = oldBox.length;
        this.weight = oldBox.weight;
        this.height = oldBox.height;
    }
    public static void displayInformation(){
        System.out.println("Running the box........");
    }

}
