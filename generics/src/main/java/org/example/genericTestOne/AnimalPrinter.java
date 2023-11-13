package org.example.genericTestOne;

public class AnimalPrinter<T extends Animal> {

    T thingToPrint;
    public AnimalPrinter(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }



}