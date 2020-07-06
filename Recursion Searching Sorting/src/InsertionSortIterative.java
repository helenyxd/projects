
public class InsertionSortIterative {
	
	public static void main(String[] args) {
		
		int[] a = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		InsertionSort(a);
		
	}
	
	public static void InsertionSort(int[] a) {
		
		for (int i = 1; i < a.length; i++) {
			
			int key = a[i];
			int j = i - 1;
			
			while (j >= 0 && a[j] > key) {
				
				a[j + 1] = a[j];
				j--;
				
			}
			
			a[j + 1] = key;
			
		}
		
		for (int o : a) {
			
			System.out.println(o);
			
		}
		
	}

}
