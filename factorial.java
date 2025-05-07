public class recursion {
    // This method calculates the factorial of a number using recursion
    // The method takes an integer n as input and returns the factorial of n
    public static int fact(int n){
        if(n==0){
            return 1;// Base case
        }
        int factorial= fact(n-1);// Recursive call
        int fn = n * fact(n-1);//
        return fn;
    }
    
    // This is the main method
    
    public static void main (String args[]){
        int n=5;
        fact(n);
        System.out.println("Factorial of " + n + " is: " + fact(n));
    }
}
