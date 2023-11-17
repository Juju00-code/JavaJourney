package org.example.atomicOpsTwo;

import java.util.concurrent.atomic.AtomicReference;

public class sessionsUtil {
    //1. private static final AtomicReference<String>
    private static final AtomicReference<String>buyerPin = new AtomicReference<>();

    //2.private static String
    //private static String buyerPin;


    //3.private static final String
    //private static final String buyerPin = new String;


    //4.private static AtomicReference<String>
    //private static AtomicReference<String>buyerPin = new AtomicReference<>();





    //1 & 4
    public static void setBuyerPin(String pin){
        buyerPin.set(pin);
        System.out.println("New Buyer pin is " + pin);
    }

    public static String getBuyerPin(){
        return buyerPin.get();
    }


    //2 & 3
    /*public static void setBuyerPin(String pin){
        buyerPin = pin;
        System.out.println("New Buyer pin is " + pin);
    }

    public static String getBuyerPin(){
        return buyerPin;
    }*/
}
