package vehicle.cars;

import java.util.Comparator;

public class SportCar extends Car{

    private Color color;

    // Constructor with 1 parameter
    public SportCar(int speed) {
        super(speed);
        this.vehicleName = "SportCar";
        this.color = Color.RED;
    }

    // Constructor with 2 parameters
    public SportCar(final Color color, int speed) {
        super(speed);
        this.vehicleName = "SportCar";
        this.color = color;
        this.speed = speed;
    }


}
