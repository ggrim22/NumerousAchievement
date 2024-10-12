import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    Map<Integer, String> romanMap = new LinkedHashMap<>();
    public StringBuilder integerToRomanConversion(int input){
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IV");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder romanNumeral = new StringBuilder();


        for(Map.Entry<Integer, String> entry : romanMap.entrySet()){
            while (input >= entry.getKey()){
                romanNumeral.append(entry.getValue());
                input -= entry.getKey();
            }
        }

        return romanNumeral;
    }

    public StringBuilder errorCatch(int input){
        StringBuilder errorMessage = new StringBuilder();
        if(input > 3000){
            errorMessage.append("Error: only numbers 1-3000");
        }else if (input < 1){
            errorMessage.append("This program accepts only positive numbers");
        }

        return errorMessage;
    }


    public StringBuilder integerToRomanNumeral(int input){
        StringBuilder outputRomanNumeral = errorCatch(input);
        if(!outputRomanNumeral.isEmpty()){
            return outputRomanNumeral;
        }

        outputRomanNumeral = integerToRomanConversion(input);
        return outputRomanNumeral;
    }


}
