package vehicle.bicycles;

import vehicle.Vehicle;

public abstract class Bicycle implements Vehicle{

    protected int transmitions;

    protected int speed;

    protected String vehicleName;

    // Constructor
    public Bicycle(int speed){
        this.speed = speed;
    }

    public int getTransmitions(){
        return this.transmitions;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }
}
