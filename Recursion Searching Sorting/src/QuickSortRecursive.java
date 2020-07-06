
public class QuickSortRecursive {
	
	public static void main(String[] args) {
		
		int[] a = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		
		QuickSort(a, 0, a.length);
		
		for (int o : a) {
			
			System.out.println(o);
			
		}
		
	}
	
	public static void QuickSort(int[] a, int l, int h) {
		
		if (l < h) {
			
			int pivot = Partition(a, l, h);
			
			QuickSort(a, l, pivot - 1);
			QuickSort(a, pivot, h);
			
		}
		
	}
	
	public static int Partition(int[]a, int l, int h) {
		
		int i = l;
		
		for (int j = l + 1; j < h; j++) {
			
			if (a[j] <= a[l]) {
				
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			}
			
		}
		
		int temp = a[i];
		a[i] = a[l];
		a[l] = temp;
			
		return (i + 1);
		
	}

}
