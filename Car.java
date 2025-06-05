
package car;


public class Car {
    public class Car {
    private String licensePlate;
    private String model;
    private boolean isAvailable;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isAvailable = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        this.isAvailable = false;
    }

    public void returnCar() {
        this.isAvailable = true;
    }

    @Override
    public String toString() {
        return model + " (" + licensePlate + ") - " + (isAvailable ? "Available" : "Rented");
    }
}

    

        
    }
    

