import java.util.Scanner;
public class Javabasics{
    // function ot oprint hollow tilted rohumbus 
    public static void hollow_rohumbus(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++){
                if (j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();  
        }
    }
  
public static void main(String args[]){
    //calling the function
   hollow_rohumbus(100);
}
}    
