import java.util.*;
public class array {
  // function to create a subarray
  public static void maxsubarray(int numbers[]){
    int carrysum = 0;
    int maxsum = Integer.MIN_VALUE;
    // loop to create subarrays
    for(int i=0;i<numbers.length;i++){
        int start = i;// starting index
        for(int j=0;j<numbers.length;j++){
            int end = j;
            carrysum =0;
            for(int k=start;k<=end;k++){
              carrysum += numbers[k];

            }
            System.out.println(carrysum);
            if(maxsum < carrysum){
                maxsum = carrysum;
            }
        }
    }
    System.out.println("max sum = " + maxsum);
  }
    public static void main (String args[]){
        int numbers[] = {1,2,3,4,5};
        maxsubarray(numbers);
}
}
    
