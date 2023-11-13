package org.example.genericTestOne;

import java.io.Serializable;

public class BoundedGenericWithInterfaces<T extends Serializable> {
    T thingToPrint;
    public BoundedGenericWithInterfaces(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}