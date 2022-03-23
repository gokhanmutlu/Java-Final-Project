public class Motorbike extends Vehicle{

    // It checks the option to be added, if it is true, it adds its cost and adds it to the havingOptionals list. If false it throws an exception.
    public void addOptional(String option) throws InvalidOptionException {
        if (option.equals("ABS")){
            cost += 5000;
            getHavingOptionals().add(option);
        }else if (option.equals("Seat Heating")){
            cost += 2000;
            getHavingOptionals().add(option);
        }else {
            throw new InvalidOptionException("You can not add this option!");
        }
    }
}
