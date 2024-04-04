public class Car extends Vehicle {
    private int doors;

    public void setDoors(int doors) {
        this.doors = doors;
        System.out.println("Doors: " + this.doors);
    }
}
