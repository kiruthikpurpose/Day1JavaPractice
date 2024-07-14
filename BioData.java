import java.util.*;

public class BioData {
    public static void main(String[] args) {
        String Name;
        int Age;
        String DoB;
        String Address;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        Name = sc.nextLine();
        System.out.println("Enter your Age: ");
        Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Date of Birth: ");
        DoB = sc.nextLine();
        System.out.println("Enter your Address: ");
        Address = sc.nextLine();

        System.out.println("\nBIO DATA:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Date of Birth: " + DoB);
        System.out.println("Address: " + Address);
        sc.close();
    }
}
