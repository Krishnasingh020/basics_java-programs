import java.util.*;

public class diagonalsum{
    public static int daigonal(int matrix[][]){
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];

                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
//Method 2 to reduce the time complexity 
      /*
      for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i)
        sum+=matrix[i][matrix.length-1-i];
    }
    return sum;
    }
    */
    }
    public static void main (String args[]){
        int matrix [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println(daigonal(matrix));
    }
}
