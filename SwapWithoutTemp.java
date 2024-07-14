import java.util.*;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: \n A = " + a + "\n B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Before swapping: \n A = " + a + "\n B = " + b);
        sc.close();
    }
}
