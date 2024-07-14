import java.util.*;

public class FToC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degrees in Fahrenheit: ");
        double F = sc.nextDouble();
        double C = (F-32) * (5.0/9);
        System.out.printf("Celsius equivalent: %.2f", C);
        sc.close();
    }
}
