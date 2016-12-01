package sort.selection;

import java.util.Arrays;

public class Selection {

	static Integer[] arr = {3,44,38,4,5,0,4,47,15,36,26,27,2,46,4,4,19,50,48};
	//static Integer[] arr = {1,2,3,4,5,6,7};
	//static Integer[] arr = {9,8,7,6,5,4,3,2,1,0};

	public static void main(String[] args) {
		
		int newIndex = 0; 
		
		for(int i = 0; i < arr.length-1; i++){
			
			int min = arr[i];
			int temp = arr[i];
			newIndex = i+1;
			for(int k = newIndex; k < arr.length; k++){
				
				if(arr[k] < min){
					min = arr[k];
					newIndex = k;
				}
			}
			
			System.out.println("min="+min+ "  index="+newIndex);
			
			if(temp != min){
				arr[i] = min;
				arr[newIndex] = temp;
			}
			
			System.out.println("-------------------------------");
			System.out.println(Arrays.asList(arr));
			
		}
		
		System.out.println("**********************************");
		System.out.println(Arrays.asList(arr));
	}
}
