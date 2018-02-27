package vehicle.cars;

public class Bus extends Car {

    private int quantityPlaces;

    // Constructor
    public Bus(int speed, int quantityPlaces){
        super(speed);
        this.vehicleName = "Bus";
        this.quantityPlaces = quantityPlaces;
    }

    public int getQuantityPlaces(){
        return this.quantityPlaces;
    }
}
