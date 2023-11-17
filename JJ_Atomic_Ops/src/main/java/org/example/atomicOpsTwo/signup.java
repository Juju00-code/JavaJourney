package org.example.atomicOpsTwo;

public class signup {
    public static void changePinSignUp(){
        System.out.println("Signup Change Pin");
        System.out.println("Previous buyerpin is  " + sessionsUtil.getBuyerPin());
        String pin = createPin.makePin();
        System.out.println("Set Buyer pin to " + pin);
        sessionsUtil.setBuyerPin(pin);
    }
}
