
public class MaxNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 3, 7, 2, 13};
		int x = findMax(arr, 0, 5);
		System.out.println(x);
		
	}
	
	public static int findMax(int[] arr, int start, int end) {
		
		if (start == end) {
			
			return arr[start];
			
		}
		
		int max1 = 0;
		int max2 = 0;
		
		if (arr.length > 2) {
			
			int mid = (start + end) / 2;
			max1 = findMax(arr, start, mid);
			max2 = findMax(arr, mid + 1, end);
			
		}
		
		if (max1 > max2) {
			
			return max1;
			
		}
		
		else {
			
			return max2;
			
		}
		
		
	}

}
