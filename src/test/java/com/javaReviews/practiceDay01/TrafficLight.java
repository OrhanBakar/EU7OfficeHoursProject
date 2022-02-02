package com.javaReviews.practiceDay01;

public class TrafficLight { // my blueprint for all traffic lights
    // We are applying encapsulation: we have private field and Getter/Setter methods
    private String color;  // why do we define a variable private

    public TrafficLight(String localTime){
        this.localTime = localTime;
    }

    public TrafficLight(){

    }

    public void showColor (){
        System.out.println("color = " + color);
    }

    // local time of each light should shared by all traffic lights

    public static String localTime;

    public void changeColor (String newColor){
        if(newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") || newColor.equalsIgnoreCase("green")){
            System.out.println("changing the color to "+newColor);
            color = newColor;
        } else {
            System.err.println("ERROR : invalid color : " + newColor);
        }
    }

}
