public class InvalidOptionException extends Exception{
    String message;
    public InvalidOptionException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
