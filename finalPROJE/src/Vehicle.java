import java.util.ArrayList;

public abstract class Vehicle {
    private String model = getClass().getName();
    int cost;
    private ArrayList<String> havingOptionals = new ArrayList<String>();

    public void addOptional(String option) throws InvalidOptionException {
    }

    public int getTotalPrice() {  //abstract olabilir!!
        return 0;
    }

    // It checks if the list is empty, if it is, it writes the price directly.
    // If not, it returns a string with the total price by adding the options in the list.
    public String toString() {
        String str = model + " with ";
        if (havingOptionals != null) {
            for (String option : havingOptionals) {
                str += option + ", ";
            }
        }
        return str + "having a total price of " + getTotalPrice() + " TL";
    }

    public String getModel() {
        return model;
    }

    public ArrayList<String> getHavingOptionals() {
        return havingOptionals;
    }
}
