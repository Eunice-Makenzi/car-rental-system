
package main.java.program;


public class MainJavaProgram{
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        agency.addCar(new Car("KAB123A", "Toyota Corolla"));
        agency.addCar(new Car("KCD456B", "Honda Civic"));

        System.out.println("Available Cars:");
        agency.displayAvailableCars();

        System.out.println("\nRenting Car KAB123A...");
        agency.rentCar("KAB123A");

        System.out.println("Available Cars:");
        agency.displayAvailableCars();

        System.out.println("\nReturning Car KAB123A...");
        agency.returnCar("KAB123A");

        System.out.println("Available Cars:");
        agency.displayAvailableCars();
    }

    private static class Car {

        public Car(String kaB123A, String toyota_Corolla) {
        }
    }

    private static class RentalAgency {

        public RentalAgency() {
        }


        private void displayAvailableCars() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }





    }
}