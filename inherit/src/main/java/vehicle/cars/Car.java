package vehicle.cars;

import vehicle.Vehicle;

import java.util.Comparator;

public abstract class Car implements Vehicle, Comparable<Car>{

    private int wheels = 4;

    protected String vehicleName;

    protected int speed;

    public Car(int speed){
        this.speed = speed;
    }

    protected int getWheels(){
        return this.wheels;
    }

    public int getSpeed(){
        return this.speed;
    }

    // Implemented method getVehicleName
    public String getVehicleName() {
        return this.vehicleName;
    }

    // Implemented method compareTo
    public int compareTo(Car c) {
        if (this.speed > c.speed)
            return 1;
        if (this.speed < c.speed)
            return -1;
        else
            return 0;
    }
}
