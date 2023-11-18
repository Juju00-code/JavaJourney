package org.example;

public class vehicleOperations {
    private  String wheel;
    private  final String transmissionType;
    private  final int  transmission_levels;


    public vehicleOperations(String wheel,String transmissionType, int  transmission_levels){
        this.wheel = wheel;
        this.transmissionType = transmissionType;
        this.transmission_levels = transmission_levels;


    }

    private static void crab_walk(){
        System.out.println("This vehicle has the feature to crab walk");
    }
    private void parkMode(){
        System.out.println("In Park mode");
    }
    private  void driveMode(){

        System.out.println("In drive mode");
    }
    private static void neutralMode(){
        System.out.println("In neutral mode");
    }

    private  void reverseMode(){
        System.out.println("In reverse mode");
    }

    public  String getTransmissionType(){
        return transmissionType;
    }

    public  int getTransmissonLevel(){
        return transmission_levels;
    }

}
