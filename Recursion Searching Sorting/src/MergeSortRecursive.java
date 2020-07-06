
public class MergeSortRecursive {
	
	public static void main(String[] args) {
		
		int[] a = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2};
		int[] y = new int[a.length];
		
		MergeSort(a, y, 0, a.length - 1);
		
		for (int o : y) {
			
			System.out.println(o);
			
		}
		
	}
	
	public static void MergeSort(int[] x, int[] y, int left, int right) {
		
		if (left == right) {
			
			y[left] = x[left];
			return;
			
		}
		
		int mid = (left + right) / 2;
		
		int[] z = new int[right + 1];
		
		MergeSort(x, z, left, mid);
		MergeSort(x, z, mid + 1, right);
		Merge(z, left, mid, z, mid + 1, right, y, left);
		
	}
	
	public static void Merge(int[] x1, int l1, int r1, int[] x2, int l2, int r2, int[] y, int l) {
		
		while (l1 <= r1 && l2 <= r2) {
			
			if (x1[l1] < x2[l2]) {
				
				y[l] = x1[l1];
				l1++;
				l++;
				
			}
			
			else {
				
				y[l] = x2[l2];
				l2++;
				l++;
				
			}
			
		}
		
		if (l1 <= r1) {
			
			for (int i = l1; i <= r1; i++) {
				
				y[l] = x1[i];
				l++;
				
			}
			
		}
		
		if (l2 <= r2) {
			
			for (int i = l2; i <= r2; i++) {
				
				y[l] = x2[i];
				l++;
				
			}
			
		}
		
	}

}
