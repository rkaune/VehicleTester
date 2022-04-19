/**
 * April 19,2022
 * Mr. Kaune
 * Another inheritance example to demonstrate Object Oriented Programming (OOP)
 */

package vehicletester;

import javax.swing.*;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0,2,1.25,0.98);
        Vehicle car2 = new Vehicle();
        Car speedyCar = new Car();
        System.out.println(speedyCar);
        //speedyCar.addFuel(gas);
        //Show Vehicle Info
        System.out.println(car1);

        //Drive car for 100km
        car1.driveVehicle(100.0);
        System.out.println(car1);

        //Drive car for 450 kms
        car1.driveVehicle(450.0);
        System.out.println(car1);

        //Try to drive 1000 km - runs out of gas
        car1.driveVehicle(1000.0);
        System.out.println(car1);

        //Add 25L of gas
        car1.addFuel(25.0);
        System.out.println(car1);

        //Try to add 100 L of gas
        car1.addFuel(100.0);
        System.out.println(car1);
        
        // Print the vehicle revenue
        System.out.println("Revenue = "+car1.vehicleRevenue());
        System.out.println(car2.vehicleRevenue());
        
        // Print the vehicle cost
        System.out.println(car1.vehicleCost());
        System.out.println(car2.vehicleCost());
        
        // Print the profit
        System.out.println(car1.vehicleProfit());
        System.out.println(car2.vehicleProfit());
    }
}
