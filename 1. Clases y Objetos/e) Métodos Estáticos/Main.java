/*
Un método estático (static) pertenece a la clase, no al objeto.
Puedes usarlo sin crear una instancia de una clase (objeto). Es útil para operaciones generales o utilitarias.
Los métodos estáticos solo pueden ser llamados por otros métodos estáticos.
*/

public class Main {
    public static void main(String[] args) {
        double tempC = 25.0;
        double tempF = ConversorTemperatura.celsiusAFahrenheit(tempC);
        System.out.println(tempC + " °C = " + tempF + " °F");

        double tempF2 = 77.0;
        double tempC2 = ConversorTemperatura.fahrenheitACelsius(tempF2);
        System.out.println(tempF2 + " °F = " + tempC2 + " °C");
    }
}
