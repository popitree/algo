package sort.insertion;

import java.util.Arrays;

public class Insertion {
	
	static Integer[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,47,19,50,48};
	//static Integer[] arr = {9,8,7,6,5,4};
	//static Integer[] arr = {1,2,3,4,5};

	public static void main(String[] args) {
		
		for(int i = 1; i < arr.length; i++){
			
			int temp = arr[i];
			
			for(int k = i-1; k >= 0 && temp < arr[k]; k--){
				//swap
				arr[k+1]=arr[k];
				arr[k] = temp; 
				System.out.println(Arrays.asList(arr));
			}
			System.out.println("-------------------------------");
			System.out.println(Arrays.asList(arr));
			
		}
		
		System.out.println(Arrays.asList(arr));
	}

}
