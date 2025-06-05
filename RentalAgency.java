
package rentalagency;

    import java.util.ArrayList;

public class RentalAgency {
    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void displayAvailableCars() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
            }
        }
    }

    public boolean rentCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && car.isAvailable()) {
                car.rentCar();
                return true;
            }
        }
        return false;
    }

    public boolean returnCar(String licensePlate) {
        for (Car car : cars) {
            if (car.getLicensePlate().equals(licensePlate) && !car.isAvailable()) {
                car.returnCar();
                return true;
            }
        }
        return false;
    }
}
