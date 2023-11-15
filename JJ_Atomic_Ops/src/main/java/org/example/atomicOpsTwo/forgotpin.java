package org.example.atomicOpsTwo;

public class forgotpin {
    public static void changePinForgotPin(){
        System.out.println("Forgotpin Change Pin");
        System.out.println("Previous buyerpin is  " + sessionsUtil.getBuyerPin());
        String pin = createPin.makePin();
        System.out.println("Set Buyer pin to " + pin);
        sessionsUtil.setBuyerPin(pin);
    }
}
