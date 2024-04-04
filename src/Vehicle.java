public class Vehicle {
    protected String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Brand: " + this.brand);
    }

}
