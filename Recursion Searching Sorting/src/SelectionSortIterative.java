
public class SelectionSortIterative {
	
	public static void main(String[] args) {
		
		int[] a = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		SelectionSort(a);
		
	}
	
	public static void SelectionSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			
			for (int k = i + 1; k < a.length; k++) {
				
				if (a[k] < a[i]) {
					
					int temp = a[k];
					a[k] = a[i];
					a[i] = temp;
					
				}
				
			}
			
		}
		
		for (int o : a) {
			
			System.out.println(o);
			
		}
		
	}

}
