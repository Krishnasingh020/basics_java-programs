import java.util.*;
class recursion{
    public static int pairingUp(int n){
        if(n == 1 || n ==2 ){
            return n;
        }
        int single = pairingUp(n-1);
        int pair = (n-1) * pairingUp(n-2);
        int totalPair = single + pair;
        return totalPair;
    }
    public static void main (String args[]){
        int n = 3;
        System.out.println("Total ways to pair up " + n + " people: " + pairingUp(n));
        
    }
}
