import java.util.*;

public class arra {
	//bubble sort
	public static void bubble_sort(int arr[]){
		for(int turn=0;turn<arr.length-1;turn++){
			for(int j=0;j<arr.length-1-turn;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	//for printign th array
	public static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	//selection sort
	public static void selection_sort(int arr[]){
		for(int i=0;i>arr.length-1;i++){
			int min_index =i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min_index]){
					min_index=j;
				}
			}
			//swapping
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
	}

	//insertion sort
	public static void insertion_sort(int arr[]){
		for (int i=1;i<arr.length;i++){
			int current =arr[i];
			int prev=i-1;
			//finding the correct position to insert
			while(prev>=0 && arr[prev]>current){
				arr[prev+1]=arr[prev];
				prev--;
			}
			//inserting the current element at the correct position
			arr[prev+1]=current;	
			}
		}
	//main function
	public static void main (String args[]){
		int arr[]={11,99,13,14,1,55,77,33,22,8};
		insertion_sort(arr);
		printarr(arr);
}
}
