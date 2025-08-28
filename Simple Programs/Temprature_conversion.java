import java.util.Scanner;

public class Temprature_conversion {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double clecius = temperature.nextDouble();
        double fahrenheit = (clecius * 9/5) + 32;
        System.out.println(clecius + " degree Celsius is equal to " + fahrenheit + " degree Fahrenheit.");
        temperature.close();
    }
}
