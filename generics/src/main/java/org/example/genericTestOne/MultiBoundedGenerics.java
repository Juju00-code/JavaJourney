package org.example.genericTestOne;

import java.io.Serializable;

public class MultiBoundedGenerics<T extends Animal & Serializable> {
    T thingToPrint;
    public MultiBoundedGenerics(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
