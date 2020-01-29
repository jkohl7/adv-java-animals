package us.mattgreen;

public class InputTypeVerifier {

    public static int numbers(String input) throws noInputException, incorrectException {
        if(input == null || input.isEmpty()) {
            noInputException empty = new noInputException();
            throw empty;
        }else{
            for(char c: input.toCharArray()){
                if(!Character.isDigit(c)){
                    incorrectException wrong = new incorrectException();
                    throw wrong;
                }
            }
            return Integer.parseInt(input);
        }
    }

    public static void name(String input)throws noInputException, incorrectException{
        if(input == null || input.isEmpty()) {
            noInputException empty = new noInputException();
            throw empty;
        }else{
            for(char c: input.toCharArray()){
                if(Character.isDigit(c)){
                    incorrectException wrong = new incorrectException();
                    throw wrong;
                }
            }
        }
    }


    public static boolean yesNo(String input)throws noInputException, incorrectException{
        if(input == null || input.isEmpty()) {
            noInputException empty = new noInputException();
            throw empty;
        }else{
            input=input.toUpperCase();
            if(!input.equals("Y") && !input.equals("N")) {
                incorrectException incorrect = new incorrectException();
                throw incorrect;
            }else{
                if(input.equals("Y")){
                    return true;
                }else{
                    return false;
                }
            }
        }

    }
}
