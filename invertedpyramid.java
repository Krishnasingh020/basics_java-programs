import java.util.Scanner;
public class Javabasics{
    // Inverted pyramid pattern
    public static void inverted_pyramid(int n ){
        // Loop for number of rows
        for (int i=1;i<=n;i++){
            //loop for printing spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //loop for printing stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //loop tp change the line
        System.out.println();
        }
    }
public static void main(String args[]){
    //calling the function
    inverted_pyramid(7);
}
}    
