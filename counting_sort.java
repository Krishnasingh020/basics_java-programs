import java.util.Scanner;
public class counting_sort{
    // function ot oprint hollow tilted rohumbus 
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        //sorting the array
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
  
public static void main(String args[]){
    int arr[] = {1,4,1,2,7,5,2};
    countingSort(arr);
    printArr(arr);
}
}    
