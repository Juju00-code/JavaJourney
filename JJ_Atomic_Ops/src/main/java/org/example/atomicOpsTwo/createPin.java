package org.example.atomicOpsTwo;

import java.util.Random;

public class createPin {


    public static String makePin(){
        Random random = new Random();

        int randomNumber = 1000 + random.nextInt(9000);

        String randomPin = String.valueOf(randomNumber);

        return randomPin;
    }
}
