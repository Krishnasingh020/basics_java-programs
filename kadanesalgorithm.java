import java.util.*;
public class array {
  // function to create a subarray
  public static void maxsubarraysum(int numbers[]){
    int carrysum = 0;
    int maxsum = Integer.MIN_VALUE;
    // loop to create subarrays
    for(int i=0;i<numbers.length;i++){
        int start = i;// starting index
        for(int j=0;j<numbers.length;j++){
            int end = j;
            int prefixsum[] = new int[numbers.length];
            prefixsum[0] = numbers[0];
            for (int k = 1; k < numbers.length; k++) {
              prefixsum[k] = prefixsum[k - 1] + numbers[k];
            }
            carrysum = start == 0 ? prefixsum[end] : prefixsum[end] - prefixsum[start - 1];
            if(maxsum < carrysum){
            maxsum = carrysum;
            }
        }
    }
    System.out.println("max sum = " + maxsum);
  }

  public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs =0;
    for(int i =0;i<numbers.length;i++){
      cs +=numbers[i];
      if(cs < 0){
        cs =0;
      }
      ms = Math.max(cs,ms);
    }
    System.out.println("max sum = " + ms);

  }
    
    public static void main (String args[]){
        int numbers[] = {1,2,3,4,5};
        maxsubarraysum(numbers);
}
}
    
