package exeptions;

public class CreditHistory extends RuntimeException{
    public CreditHistory(String message) {
        super(message);
    }
}
