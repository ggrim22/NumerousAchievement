public class ErrorCatch {

    public StringBuilder errorCatch(int input){
        StringBuilder errorMessage = new StringBuilder();
        if(input > 3000){
            errorMessage.append("Error: only numbers 1-3000");
        }else if (input < 1){
            errorMessage.append("This program accepts only positive numbers");
        }

        return errorMessage;
    }
}
