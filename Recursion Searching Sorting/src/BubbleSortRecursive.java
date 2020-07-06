
public class BubbleSortRecursive {
	
	public static void main(String[] args) {
		
		int[] a = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		BubbleSort(a, 0);
		
	}
	
	public static void BubbleSort(int[] a, int i) {
		
		if (i == a.length) {
			
			for (int o : a) {
				
				System.out.println(o);
				
			}
			
			return;
			
		}
		
		for (int k = 0; k < a.length - 1 - i; k++) {
			
			if (a[k] > a[k + 1]) {
				
				int temp = a[k];
				a[k] = a[k + 1];
				a[k + 1] = temp;
				
			}
			
		}
		
		BubbleSort(a, i + 1);
		
	}

}
