import java.util.*;
public class array {
  // function to create a subarray
  public static void subarray(int numbers[]){
    // loop to create subarrays
    for(int i=0;i<numbers.length;i++){
        int start = i;// starting index
        for(int j=0;j<numbers.length;j++){
            int end = j;
            for(int k=start;k<=end;k++){
                System.out.print(numbers[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
  }
    public static void main (String args[]){
        int numbers[] = {1,2,3,4,5};
        subarray(numbers);
}
}
    
