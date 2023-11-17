package org.example.atomicOpsTwo;

public class basicLogin {

    public static void changePinBasicLogin(){
        System.out.println("BasicLogin Change Pin");
        System.out.println("Previous buyerpin is  " + sessionsUtil.getBuyerPin());
        String pin = createPin.makePin();
        System.out.println("Set Buyer pin to " + pin);
        sessionsUtil.setBuyerPin(pin);
    }
}
