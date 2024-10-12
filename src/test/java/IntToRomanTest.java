import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntToRomanTest {
    @Test

    public void intToRomanTest5(){
        IntegerToRoman intToRom = new IntegerToRoman();
        String result = intToRom.integerToRoman(5);
        Assertions.assertEquals(result, "V");

    }

    @Test
    public void intToRomanTest4(){
        IntegerToRoman intToRom = new IntegerToRoman();
        String result = intToRom.integerToRoman(4);
        Assertions.assertEquals(result, "IV");
    }

    @Test
    public void intToRomanTest400(){
        IntegerToRoman intToRom = new IntegerToRoman();
        String result = intToRom.integerToRoman(400);
        Assertions.assertEquals(result, "CD");
    }

    @Test
    public void intToRomanTest63(){
        IntegerToRoman intToRom = new IntegerToRoman();
        String result = intToRom.integerToRoman(63);
        Assertions.assertEquals(result, "LXIII");
    }

    @Test
    public void intToRomanTest953(){
        IntegerToRoman intToRom = new IntegerToRoman();
        String result = intToRom.integerToRoman(953);
        Assertions.assertEquals(result, "CMLIII");
    }



}
