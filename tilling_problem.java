import java.util.*;
class recursion{
    public static int TillingProblem(int n){
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //recursive case
        int fnm1 =  TillingProblem(n-1);
        int fnm2 =  TillingProblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main (String args[]){

        System.out.println(TillingProblem(3));
    }
}
