import java.util.ArrayList;

public class Inventory {
    private ArrayList<Vehicle> inventory = new ArrayList<Vehicle>(); // list of vehicles.

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    // To add new vehicles to the list.
    public void addList(Vehicle name){
        inventory.add(name);
    }

    // It loops every object on the list, collects its prices and prints each object with its information.
    // Also there are counter to find number of cars and motorbikes. It checks the model and increasing the counters.
    public void printInventory() {
        int carCount = 0;
        int motorbikeCount = 0;
        int totalPrice = 0;
        for (Vehicle vehicle : inventory) {
            totalPrice += vehicle.getTotalPrice();
            System.out.println(vehicle.toString());
            if (vehicle.getModel().equals("Sivic") || vehicle.getModel().equals("Sity"))
                carCount++;
            else
                motorbikeCount++;
        } ///TOTAL : 5 Vehicles including 3 Cars and 2 Motorbikes having a total price of 248000 TL
        System.out.println("TOTAL : " + (carCount + motorbikeCount) + " Vehicles including " + carCount + " Cars and " + motorbikeCount + " Motorbikes having a total price of " + totalPrice + " TL");

    }


}
