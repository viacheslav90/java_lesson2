package vehicle.ships;

import vehicle.Vehicle;

public abstract class Ship implements Vehicle{

    protected String vehicleName;

    protected int speed;

    public Ship(int speed){
        this.speed = speed;
    }

    public String getVehicleName() {
        return this.vehicleName;
    }
}
