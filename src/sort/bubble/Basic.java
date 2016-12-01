package sort.bubble;

import java.util.Arrays;

public class Basic {
	
	static Integer[] arr = {9,2,1,0,5,6,8,3,7,4};

	public static void main(String[] args) {
		int lastIndex = arr.length;
		int temp;
		while(lastIndex > 1){
			for(int i = 0; i <lastIndex-1 ; i++ ){
				if(arr[i] > arr[i+1]){
					//swap
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				System.out.println(Arrays.asList(arr));
			}
			lastIndex--;
			System.out.println("---------------------------------");
		}
		
		System.out.println(Arrays.asList(arr));
		
	}
}
