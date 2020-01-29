package us.mattgreen;

public class noInputException extends Exception{
    public  noInputException() {
        super("Data was not entered at all");
    }
}
