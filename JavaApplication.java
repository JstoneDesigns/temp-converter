import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double var_input;
        
        var_input = input.nextDouble();
        boolean isFarenheit;
        
        isFarenheit = input.nextBoolean();
        if (isFarenheit) {
            System.out.println(fahrenheitToCelsius(var_input));
        } else {
            System.out.println(celsiusToFahrenheit(var_input));
        }
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        
        fahrenheit = 9 * celsius / 5 + 32;
        
        return fahrenheit;
    }
    
    public static double fahrenheitToCelsius(double fahrenheitInput) {
        double celsiusOutput;
        
        celsiusOutput = (fahrenheitInput - 32) * 5 / 9;
        
        return celsiusOutput;
    }
}
