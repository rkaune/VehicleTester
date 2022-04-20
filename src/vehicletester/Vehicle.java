/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package vehicletester;

public class Vehicle {
    private double gasKilometrage;
    public double fuelTankSize;
    public double fuelAvailable;
    public double kilometresTravelled;
    public int numberOfPassengers;
    public double passengerFare;
    public double costOfFuel;
    public Engine e;
    
    public Vehicle() {
        //Default Constructor
        gasKilometrage = 0;
        fuelTankSize = 0;
        fuelAvailable = 0;
        kilometresTravelled = 0;
        numberOfPassengers = 0;
        passengerFare = 0;
        costOfFuel = 0;
    }

    public Vehicle(double gK, double fTS, double fA, double kT, int nP, double pF,double cOF){
        gasKilometrage = gK;
        fuelTankSize = fTS;
        fuelAvailable = fA;
        kilometresTravelled = kT;
        numberOfPassengers  = nP;
        passengerFare = pF;
        costOfFuel = cOF;
    }
    public void setKilometrage (double gK){
        gasKilometrage = gK;
    }
    
    public double getKilometrage (){
        return gasKilometrage;
    }
    
    public double vehicleRevenue(){
        double revenue;
        revenue = numberOfPassengers * passengerFare;
        return revenue;
    }
    
    public double vehicleCost(){
        double cost;
        cost = gasKilometrage * costOfFuel * kilometresTravelled ;
        return cost;
    }
    
    public double vehicleProfit(){
        double profit;
        profit =  vehicleCost()- vehicleRevenue();
        return profit;
    }
    public void addFuel(double gas){
        
        if((fuelTankSize - fuelAvailable) >= gas){
            fuelAvailable += gas;
            System.out.println("Added " + gas + "L of gas to the tank.");
        }
        else {
            System.out.println("You tried to add " + gas + "L of gas.");
            System.out.println("There is only room for " + (fuelTankSize - fuelAvailable) + "L.");
        }
    }

    public void driveVehicle(double kms){
        //Drive the vehicle
        //ex.  If the vehicle uses 9.5L/100 km then
        //     litresNeeded = kms * 9.5 / 100
        System.out.println("Drive " + kms + "kms.  Start with " + fuelAvailable + "L of gas.");
        double litresNeeded = (kms * gasKilometrage) / 100.0;
        if(fuelAvailable >= litresNeeded){
            fuelAvailable -= litresNeeded;
            kilometresTravelled += kms;
            System.out.println("Used " + litresNeeded + "L of gas.");
        }
        else {
            System.out.println("Ran out of fuel!");
            //Calculate how many kms were driven
            double kmsThisDrive = (fuelAvailable * 100.0) / gasKilometrage;
            kilometresTravelled += kmsThisDrive;
            fuelAvailable = 0;
            System.out.println("The vehicle drove " + kmsThisDrive + " before running out of gas.");
        }
    }

    @Override
    public String toString() {
        String output = "Gas Kilometrage = " + gasKilometrage + "\n";
        output += "Fuel Tank Size = " + fuelTankSize + "\n";
        output += "Fuel Available = " + fuelAvailable + "\n";
        output += "Kilometres Driven = " + kilometresTravelled + "\n";
        return output;
    }
    
    public class Engine{
        double displacement;
        int numberOfCylinders;
        int numberOfDriveWheels;
        
    public Engine(){
        displacement = 2.5;
        numberOfCylinders = 4;
        numberOfDriveWheels = 2;
    }
    
    public boolean fourWheelDrive(){
        if(numberOfDriveWheels == 4){
            return true;
        }
        return false;
    }
}
}
