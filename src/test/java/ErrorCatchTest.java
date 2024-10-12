import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ErrorCatchTest {
    @Test
    public void testErrorCatchForNumsGreaterThan3000(){
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String outputString = "Error: only numbers 1-3000";
        StringBuilder result = integerToRoman.errorCatch(4000);
        Assertions.assertEquals(outputString, result.toString());
    }

    @Test
    public void testErrorCatchForNonPositiveNums(){
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String outputString = "This program accepts only positive numbers";
        StringBuilder result = integerToRoman.errorCatch(0);
        Assertions.assertEquals(outputString, result.toString());
    }
}
