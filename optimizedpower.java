import java.util.*;
class recursion{
    public static int optimizedepower(int a, int n){
        if(n == 0){
            return 1;
        }
        int halfPowersq = optimizedepower(a, n / 2);
        int halfPower = halfPowersq * halfPowersq;
        if (n % 2 != 0) {
            halfPower = a * halfPower;
        } 
        return halfPower;
    }
    public static void main (String args[]){
        
        System.out.println(optimizedepower(2,10));
    }
} 
