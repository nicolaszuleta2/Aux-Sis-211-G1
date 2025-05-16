public class ConversorTemperatura {
    
    // Método estático: Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método estático: Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
