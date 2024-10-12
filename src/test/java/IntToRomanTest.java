import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntToRomanTest {
    @Test

    public void intToRomanTest5(){
        IntegerToRoman intToRom = new IntegerToRoman();
        StringBuilder result = intToRom.integerToRomanConversion(5);
        Assertions.assertEquals(result.toString(), "V");

    }

    @Test
    public void intToRomanTest4(){
        IntegerToRoman intToRom = new IntegerToRoman();
        StringBuilder result = intToRom.integerToRomanConversion(4);
        Assertions.assertEquals(result.toString(), "IV");
    }

    @Test
    public void intToRomanTest400(){
        IntegerToRoman intToRom = new IntegerToRoman();
        StringBuilder result = intToRom.integerToRomanConversion(400);
        Assertions.assertEquals(result.toString(), "CD");
    }

    @Test
    public void intToRomanTest63(){
        IntegerToRoman intToRom = new IntegerToRoman();
        StringBuilder result = intToRom.integerToRomanConversion(63);
        Assertions.assertEquals(result.toString(), "LXIII");
    }

    @Test
    public void intToRomanTest953(){
        IntegerToRoman intToRom = new IntegerToRoman();
        StringBuilder result = intToRom.integerToRomanConversion(953);
        Assertions.assertEquals(result.toString(), "CMLIII");
    }

    @Test
    public void intToRomanTest3000(){
        IntegerToRoman intToRom = new IntegerToRoman();
        StringBuilder result = intToRom.integerToRomanConversion(3000);
        Assertions.assertEquals(result.toString(), "MMM");
    }




}
