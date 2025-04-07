import java.util.Scanner;
public class Javabasics{
    // Function to check if a number is prime
    public static boolean isprime(int n){
        for (int i=2;i<n-1;i++){
            if (n%i==0){
            
                return false; // Return 0 if not prime
            }
        }
        return true; // Return 1 if prime
    }
    // Function to print all prime numbers in a given range
    public static void primesinrange(int n){
        for (int i=2;i<n;i++){
            if (isprime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    //main function 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        primesinrange(n);// Call the function to print prime numbers in the range
        
    }
}
