package org.example;

import org.example.atomicOpsTwo.basicLogin;
import org.example.atomicOpsTwo.forgotpin;
import org.example.atomicOpsTwo.signup;

public class Main {


    private static int counter = 10;

    public static void main(String[] args) {
        for( int i=0; i < counter; i++){
            runAllthree();
        }
    }
    public static void runAllthree(){
        signup.changePinSignUp();
        forgotpin.changePinForgotPin();
        basicLogin.changePinBasicLogin();
    }


}