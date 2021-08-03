package com.company;
/*
*Written by : Betty
* Date : july 29
* This class will work accept and display name and number of animals legs */

public class Animal {
    //defining an instance
    private String animal_name;
    private int number_of_legs;
    //constructor with no parameter
    public Animal(){
        this.animal_name = "Snake";
        this.number_of_legs = 0;
    }
    //constructor with two parameter
    public Animal(String animal_name,int number_of_legs){
        this.animal_name = animal_name;
        this.number_of_legs = number_of_legs;
    }
    //a set method for name of the animal
    public void setName(String animal_name){
        this.animal_name = animal_name;
    }
    //a st method for the number of legs of the animal
    public void setNumberOfLeg(int number_of_legs){
        this.number_of_legs = number_of_legs;
    }
    //getter method for name of the animal
    public String getName() {
        return this.animal_name;
    }
   // getter method for the number of legs of the animal
    public int getNumberOfLeg(){
        return this.number_of_legs;
    }
    //a method that display the name and legs of the animal
    public void print(){
        System.out.println(animal_name + " have " + number_of_legs + " legs.");
    }

}
