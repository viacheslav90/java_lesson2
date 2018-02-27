import vehicle.Vehicle;
import vehicle.bicycles.HighwayBicycle;
import vehicle.cars.Car;
import vehicle.cars.Color;
import vehicle.cars.SportCar;
import vehicle.ships.Boat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Create vehicles
        SportCar defaultSportCar = new SportCar(200);
        SportCar yellowSportCar = new SportCar(Color.YELLOW, 250);
        HighwayBicycle highwayBicycle = new HighwayBicycle(45);
        Boat boat = new Boat(100);

        // Working with ArrayList
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(defaultSportCar);
        vehicles.add(yellowSportCar);
        vehicles.add(highwayBicycle);
        vehicles.add(boat);
        for (Vehicle veh : vehicles) {
            System.out.println(veh.getVehicleName() + " - from ArrayList using foreach");
        }
        Iterator<Vehicle> it = vehicles.iterator();
        while (it.hasNext())
            System.out.println(it.next().getVehicleName() + " - from ArrayList using iterator");
        if (vehicles.contains(defaultSportCar))
            System.out.println("ArrayList contain: " + defaultSportCar.getVehicleName());
        vehicles.remove(defaultSportCar);
        System.out.println("Default sport car has been removed from ArrayList");


        // Working with HashSet
        HashSet<Vehicle> hashSetVehicles = new HashSet<Vehicle>();
        hashSetVehicles.add(defaultSportCar);
        hashSetVehicles.add(yellowSportCar);
        hashSetVehicles.add(highwayBicycle);
        hashSetVehicles.add(boat);
        System.out.println("\n");
        Iterator<Vehicle> iter = hashSetVehicles.iterator();
        while (iter.hasNext())
            System.out.println("HashSet contain " + iter.next().getClass());
        if (hashSetVehicles.contains(yellowSportCar)) {
            System.out.println("This HashSet contain yellow sport car");
        }


        // Working with TreeSet
        TreeSet<Car> carsTreeSet = new TreeSet<Car>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            SportCar sportCar = new SportCar(rand.nextInt((300 - 150 + 1)) + 150);
            carsTreeSet.add(sportCar);
        }
        System.out.println("\n");
        for (Car car : carsTreeSet) {
            System.out.println("Speed of Sport car in TreeSet: " + car.getSpeed());
        }


        // Working with HashMap
        HashMap <String, Car> carsHashMap = new HashMap<String, Car>();
        carsHashMap.put("default_sport_car", defaultSportCar);
        carsHashMap.put("yellow_sport_car", yellowSportCar);
        System.out.println("\n");
        Car car = carsHashMap.get("default_sport_car");
        System.out.println("Vehicle name: " + car.getVehicleName() + ". Vehicle speed: " + car.getSpeed());
        System.out.println("Does this HashMap contain yellow sport car? - " + carsHashMap.containsValue(yellowSportCar));


        // Working with TreeMap
        TreeMap<Vehicle, String> vehicleTreeMap = new TreeMap<Vehicle, String>();
        vehicleTreeMap.put(defaultSportCar, "default_sport_car");
        vehicleTreeMap.put(yellowSportCar, "yellow_sport_car");
        System.out.println("\n");
        String v = vehicleTreeMap.get(defaultSportCar);
        System.out.println(v);

    }
}
