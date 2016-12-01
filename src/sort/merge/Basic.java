package sort.merge;

import java.util.Arrays;

public class Basic {
	
	static Integer[] arr = {3,44,38,4,5,0,4,47,15,36,26,27,2,46,4,4,19,50,48};
	
	public static void main(String[] args) {

		new Basic().mergeSort(arr);
	}
	
	
	public Integer[] mergeSort(Integer[] data){
		
		int length = data.length;
		
		if(length == 1){
			return data;
		}
		
		Integer[] arr1 = new Integer[length/2];
		Integer[] arr2 = new Integer[length - length/2];
		
		System.arraycopy(data, 0, arr1, 0, length/2);
		System.arraycopy(data, length/2, arr2, 0, (length - length/2));
		
		System.out.println("Arr1:"+Arrays.asList(arr1) + "  Arr2:"+Arrays.asList(arr2) );
		
		arr1 = mergeSort(arr1);
		arr2 = mergeSort(arr2);
		
			
		return merge(arr1,arr2);
		
		
	}

	public Integer[] merge(Integer[] left, Integer[] right){
		
		Integer[] mergedData = new Integer[left.length + right.length];
		
		System.out.println("Left:"+Arrays.asList(left) + "  Right:"+Arrays.asList(right) );
		
		int l1 = left.length;
		int l2 = right.length;
		
		int i = 0;
		int j = 0;
		
		while(i < l1 && j < l2){
			if(left[i] > right[j])
				mergedData[i+j] = right[j++];
			else
				mergedData[i+j] = left[i++];
		}
		
		while(i<l1){
			mergedData[i+j]=left[i++];
		}
		while(j<l2){
			mergedData[i+j]=right[j++];
		}
		
		
		System.out.println("MergedData:"+Arrays.asList(mergedData));
		
		
		return mergedData;
	}
}
