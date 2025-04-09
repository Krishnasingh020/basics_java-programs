//Function to create a zero_one_triangle
import java.util.Scanner;
public class Javabasics{
    // function to print 0-1 triangle
    public static void zer_one_triangle(int n){
        for (int i =0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
public static void main(String args[]){
    //calling the function
    zer_one_triangle(6);
}
}    
