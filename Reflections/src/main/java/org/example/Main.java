package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        getFieldNamesInReflections();
        breakingOOPWithReflections();
        breakingOOPWithReflections();
        accessingMethods();
        accessingStaticMethod();
    }

    public static void getFieldNamesInReflections(){
        vehicleOperations audiA7 = new vehicleOperations("wheel","automatic",5);
        Field[] audiA7Fields = audiA7.getClass().getDeclaredFields();
        for(Field field : audiA7Fields){
            System.out.println(field.getName());
        }
    }

    public static void breakingOOPWithReflections()throws Exception{
        vehicleOperations bmw528i = new vehicleOperations("wheel","manual",6);
        Field[] bmw528iFields = bmw528i.getClass().getDeclaredFields();
        for(Field field : bmw528iFields){
            if(field.getName().equals("transmissionType")){
                field.setAccessible(true);
                field.set(bmw528i,"automatic");
                System.out.println(bmw528i.getTransmissionType());
            }
        }
    }

    public static void accessingMethods()throws Exception{
            vehicleOperations benzAclass = new vehicleOperations("wheel","manual",6);
            Method[] benzAclassMethods = benzAclass.getClass().getDeclaredMethods();
            for(Method method : benzAclassMethods){
                if(method.getName().equals("driveMode")){
                    method.setAccessible(true);
                    method.invoke(benzAclass);
                }
                System.out.println(method.getName());
            }
    }

    public static void accessingStaticMethod()throws Exception{
        vehicleOperations gmcHammerEV = new vehicleOperations("wheel","manual",6);
        Method[] gmcHammerEVclassMethods = gmcHammerEV.getClass().getDeclaredMethods();
        for(Method method : gmcHammerEVclassMethods){
            if(method.getName().equals("crab_walk")){
            method.setAccessible(true);
            method.invoke(null);
            }
        }
    }
}