public class Test {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        // it checks the options for is they true or false. if its false its not adding the option to the vehicle.
        Vehicle vehicle = new Sivic();
        try {
            vehicle.addOptional("ABS");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }
        try {
            vehicle.addOptional("Music System");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }
        try {
            vehicle.addOptional("Airbag");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }
        inventory.addList(vehicle);

        vehicle = new Sivic();
        try {
            vehicle.addOptional("ABS");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }
        try {
            vehicle.addOptional("Sunroof");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }

        inventory.addList(vehicle);

        vehicle = new Sity();
        try {
            vehicle.addOptional("Music System");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }
        try {
            vehicle.addOptional("Sunroof");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }

        inventory.addList(vehicle);

        vehicle = new Racer();
        try {
            vehicle.addOptional("ABS");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }
        try {
            vehicle.addOptional("Seat Heating");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }

        inventory.addList(vehicle);

        vehicle = new Scooter();
        try {
            vehicle.addOptional("Seat Heating");
        } catch (InvalidOptionException e) {
            System.out.println(e);
        }

        inventory.addList(vehicle);

        inventory.printInventory();

    }
}
