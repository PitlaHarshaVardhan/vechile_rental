class Vehicle {
    protected String vehicleNumber;
    protected String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleInfo() {
        return vehicleType + " with vehicle number: " + vehicleNumber;
    }
}

class Car extends Vehicle {
    public Car(String vehicleNumber) {
        super(vehicleNumber, "Car");
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber, "Bike");
    }
}

class Customer {
    private String name;
    private String licenseNumber;

    public Customer(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getCustomerInfo() {
        return "Customer: " + name + ", License Number: " + licenseNumber;
    }
}

class Rental {
    private Vehicle vehicle;
    private Customer customer;
    private int days;

    public Rental(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
    }

    public double calculateRental() {
        if (vehicle instanceof Car) {
            return days * 50;
        } else if (vehicle instanceof Bike) {
            return days * 20;
        } else {
            return 0;
        }
    }

    public void showRentalDetails() {
        System.out.println(customer.getCustomerInfo());
        System.out.println(vehicle.getVehicleInfo());
        System.out.println("Rental Days: " + days);
        System.out.println("Total Rental Cost: $" + calculateRental());
    }
}

public class rentals {
    public static void main(String[] args) {
        Vehicle car = new Car("ABC123");
        Customer customer1 = new Customer("John Doe", "DL12345678");

        Rental rental1 = new Rental(car, customer1, 5);
        rental1.showRentalDetails();

        System.out.println();

        Vehicle bike = new Bike("XYZ987");
        Customer customer2 = new Customer("Jane Doe", "DL87654321");

        Rental rental2 = new Rental(bike, customer2, 3);
        rental2.showRentalDetails();
    }
}