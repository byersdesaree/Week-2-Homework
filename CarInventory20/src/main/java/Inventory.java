import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Inventory {
    Scanner scanner = new Scanner(System.in);
    Car c1 = new Car();

    public void addCar(Car car) {
        do {
            System.out.println("Add car? (y/n)");

            if (scanner.next().startsWith("y")) {
                System.out.println("Make:");
                Scanner addMake = new Scanner(System.in);
                String Make = (addMake.nextLine());

                System.out.println("Model:");
                Scanner addModel = new Scanner(System.in);
                String Model = (addModel.nextLine());

                System.out.println("Year:");
                Scanner addYear = new Scanner(System.in);
                int Year = (addYear.nextInt());

                System.out.println("Color:");
                Scanner addColor = new Scanner(System.in);
                String Color = (addColor.nextLine());

                System.out.println("Mileage");
                Scanner addMileage = new Scanner(System.in);
                double Mileage = (addMileage.nextDouble());

                c1.carList.add(new Car(Make, Model, Year, Color, Mileage));
            }
        } while (true);
    }

    public void removeCar(String make) {
        System.out.println("Delete car? y/n");
        if (scanner.next().startsWith("y")) {
            System.out.println("Make:");
            Iterator<Car> index = c1.carList.iterator();
            while (index.hasNext()) {
                Car car = index.next();
                if (c1.getMake().equals(make)) {
                    index.remove();
                }
            }
        }
    }

    public void searchbyMake(String make) {
        List<Car> results = new ArrayList<Car>();
        for (Car index : results) {
            if (index.getMake().equals(make)) {
                results.add(index);
            }
        }
        System.out.print(results);
    }

    public void searchbyModel(String model) {
        List<Car> results = new ArrayList<Car>();
        for (Car index : results) {
            if (index.getModel().equals(model)) {
                results.add(index);
            }
        }
        System.out.print(results);
    }

    public void searchbyYear(int year) {
        List<Car> results = new ArrayList<Car>();
        for (Car index : results) {
            if (index.getYear() == year) {
                results.add(index);
            }
        }
        System.out.print(results);
    }

    public void searchbyColor(String color) {
        List<Car> results = new ArrayList<Car>();
        for (Car index : results) {
            if (index.getColor().equals(color)) {
                results.add(index);
            }
        }
        System.out.print(results);
    }

    public void searchbyMileage(double mileage) {
        List<Car> results = new ArrayList<Car>();
        for (Car index : results) {
            if (index.getMileage() < mileage) {
                results.add(index);
            }
        }
        System.out.print(results);
    }

    public void displayInventory() {
        for (Car index : c1.carList) {
            System.out.println();
        }
    }
}



