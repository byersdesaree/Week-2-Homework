import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private double Mileage = 150000;
    public static List<Car> carList;

    public Car() {
        carList = new ArrayList<Car>();
    }

    public Car(String make, String mode, int year, String color, double Mileage) {
        this.make = make;
        this.model = mode;
        this.year = year;
        this.color = color;
        this.Mileage = Mileage;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String mode) {
        this.model = mode;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return this.Mileage;
    }

    public void setMileage(double Mileage) {
        this.Mileage = Mileage;
    }

    public static List<Car> getCarList() {
        return carList;
    }

    public static void setCarList(List<Car> carList) {
        Car.carList = carList;

    }
}

