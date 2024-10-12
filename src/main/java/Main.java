import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number 1-3000 to convert to roman numeral: ");
        int input = scanner.nextInt();
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.integerToRomanNumeral(input));
    }
}
