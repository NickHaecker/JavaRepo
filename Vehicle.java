public class Vehicle {
    int numberPassengers;
    static int noVehicles = 0;

    Vehicle(int noP) {
        numberPassengers = noP;
        noVehicles++;
    }
}

class staticDemo {
    public static void main(String args[]) {

        int noVehicles = Vehicle.noVehicles;
        System.out.println(noVehicles);
        Vehicle v1 = new Vehicle(2);
        Vehicle v2 = new Vehicle(4);
        Vehicle v3 = new Vehicle(8);
        noVehicles = Vehicle.noVehicles;
        System.out.println(Vehicle.noVehicles);
    }
}
