import java.util.Scanner;
import static java.lang.StrictMath.sqrt;

public class EuclidianPrime {

    private static boolean testPrimality(int n) {
        if(n<1) throw new IllegalArgumentException();
        if(n==1) return false;
        for(int i=2; i<=sqrt(n); i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args) {
        boolean test;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to test primality: ");
        int n = scan.nextInt();
        try {
            test = testPrimality(n);
            if(test) System.out.println(n + " is a prime number!");
            else System.out.println(n + " is a composite number!");
        }
        catch(IllegalArgumentException e) {
            System.out.println("The entered integer \"" + n + "\" isn't valid for primality testing!");
        }

        System.out.println("Now, please enter a number N to get Nth prime number: ");
        n = scan.nextInt();
        System.out.println("This is not a valid entry!");
        int k = 0, c = 0;
        while(c<n) {
            k+=1;
            if(testPrimality(k)) c++;
        }
        System.out.println("The " +n+ "th prime is: " + k);
    }
}
