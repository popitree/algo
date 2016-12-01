package search.binary;

public class Binary {

	static int[] arr = {7,8,9,10,11,12,13,14,15,45,67}; 
	
	public static void main(String[] args) {
		
		int searchKey = 17;
		
		int low = 0;
		int high = arr.length - 1;
		boolean isFound = false;
		int index = -1;
		
		while((high - low) >= 0 && !isFound){
			int mid = low + (high-low)/2;
			System.out.println("low:"+low+"  high:"+high+"  mid:"+mid);
			if(arr[mid] == searchKey){
				isFound = true;
				index = mid;
			}
			else if(searchKey > arr[mid]){
				low = mid+1;
			}else{
				high = mid - 1;
			}
			
		}
				
System.out.println("Index:"+index);
	}

}
