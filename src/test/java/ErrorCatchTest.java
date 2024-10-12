import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ErrorCatchTest {
    @Test
    public void testErrorCatchForNumsGreaterThan3000(){
        ErrorCatch errorCatch = new ErrorCatch();
        String outputString = "Error: only numbers 1-3000";
        StringBuilder result = errorCatch.errorCatch(4000);
        Assertions.assertEquals(outputString, result.toString());
    }

    @Test
    public void testErrorCatchForNonPositiveNums(){
        ErrorCatch errorCatch = new ErrorCatch();
        String outputString = "This program accepts only positive numbers";
        StringBuilder result = errorCatch.errorCatch(0);
        Assertions.assertEquals(outputString, result.toString());
    }
}
