class Vehicle {
    private String make;
    private String model;
    private int year;
    private double rentalPricePerDay;

    public Vehicle(String make, String model, int year, double rentalPricePerDay){
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalPricePerDay = rentalPricePerDay;
    }
    
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

    public double calculateRentalCost(int days){
        double rentalCost = rentalPricePerDay * days;

        return rentalCost;
    }
}

class Car extends Vehicle{
    private int numSeats;
    private int numDoors; 

    public Car(String make, String model, int year, double rentalPricePerDay, int numSeats, int numDoors){
        super(make, model, year, rentalPricePerDay);
        this.numSeats = numSeats;
        this.numDoors = numDoors;
    }

    public int getNumSeats(){
        return numSeats;
    }

    public int getNumDoors(){
        return numDoors;
    }

}
    
class Motorcycle extends Vehicle{
    private int engineSize;

    public Motorcycle(String make, String model, int year, double rentalPricePerDay, int engineSize){
        super(make, model, year, rentalPricePerDay);
        this.engineSize = engineSize;
    }

    public int getEngineSize(){
        return engineSize;
    }
}

public class VehicleRental{
    public static void main(String[] args) {
        Car car = new Car("Perodua", "Axia", 2022, 80.5, 5, 4);
        Motorcycle motorcycle = new Motorcycle("Honda","Vario", 2023, 40, 400);

        int days = 3;

        System.out.println("----- Car Rental -----");
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Number of Seats: " + car.getNumSeats());
        System.out.println("Number of Doors: " + car.getNumDoors());
        System.out.println("Rental Price per Day: RM" + car.getRentalPricePerDay());
        System.out.println("Rental Cost: RM" + car.calculateRentalCost(days));
        System.out.println();

        System.out.println("----- Motorcycle Rental -----");
        System.out.println("Make: " + motorcycle.getMake());
        System.out.println("Model: " + motorcycle.getModel());
        System.out.println("Year: " + motorcycle.getYear());
        System.out.println("Engine Size: " + motorcycle.getEngineSize());
        System.out.println("Rental Price per Day: RM" + motorcycle.getRentalPricePerDay());
        System.out.println("Rental Cost: RM" + motorcycle.calculateRentalCost(days));
    }
}