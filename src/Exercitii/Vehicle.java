package Exercitii;

public abstract class Vehicle {
    int numberOfWheels;
    boolean hasEnhine;
    String message;

    public Vehicle(){
        message ="This is a cool ";
        numberOfWheels = 1;
    }

    public abstract String getIdentity(String vehicle);
public abstract String getIdentity();

}

