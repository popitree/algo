package sort.radix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic {

	//static Integer[] arr = {3,44,38,4,5,0,4,47,15,36,26,27,2,46,4,4,19,50,48};
	static Integer[] arr = {170, 45, 75, 90, 802, 2, 24, 66};
	
	public static void main(String[] args) {
		
		Integer[] transArr = new Integer[arr.length];
		System.arraycopy(arr, 0, transArr, 0, arr.length);
		List<List<Integer>> bucketList = getEmptyBucketList();		
		
		int totDigits = getHighestDigits();
		int j = 1;
		
		while(j <= totDigits){
			int ten = (int)Math.pow(10, j++);
			for(int i = 0; i < arr.length; i++){
				bucketList.get((int)(transArr[i]%ten)/(ten/10)).add(transArr[i]);
			}
			
			transArr = bucketToArray(bucketList, arr.length);			
			bucketList = getEmptyBucketList();
			System.out.println(Arrays.asList(transArr));
		}
	}
	
	public static List<List<Integer>> getEmptyBucketList(){
		List<List<Integer>> bucketList = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			bucketList.add(new ArrayList<Integer>());
		}
		return bucketList;
	}
	
	public static Integer[] bucketToArray(List<List<Integer>> bucketList, int arrLength){
		int i = 0;
		Integer[] transArr = new Integer[arrLength]; 
		
		for(List<Integer>  bucket: bucketList){
			for(Integer data : bucket){
				transArr[i++] = data;
			}
		}
		return transArr;
	}
	
	public static int getHighestDigits() {
		//System.out.println((int)1234%10000/1000);
		
		int highestDigits = 0;
		for(int i = 0; i < arr.length; i++){
			if((int)(Math.log10(arr[i])) +1 > highestDigits){
				highestDigits = (int)(Math.log10(arr[i])) +1;
			}
			
		}
		
		return highestDigits;
	}
}
