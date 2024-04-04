public class App {
    public static void main(String[] args) throws Exception {
        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car();
        vehicles[0].setBrand("BMW");

        if (vehicles[0] instanceof Car) {
            System.out.println("Das Objekt ist vom Typ Car.");
            Car c = (Car) vehicles[0];
            c.setDoors(4);
        } else {
            System.out.println("Das Objekt ist nicht vom Typ Car.");
        }

        vehicles[1] = new Motorbike();
        vehicles[1].setBrand("Honda");

    }
}
