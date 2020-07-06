
public class BubbleSortIterative {
	
	public static void main(String[] args) {
	
		int[] a = {4, 77, 98, 30, 20, 50, 77, 22, 49, 2}; 
	
		for (int i = 0; i < a.length; i++) {
		
			for (int k = 0; k < a.length - 1 - i; k++) {
				
				if (a[k] > a[k + 1]) {
					
					int temp = a[k + 1];
					a[k + 1] = a[k];
					a[k] = temp;
					
				}
				
			}
			
		
		}
		
		for (int o : a) {
			
			System.out.println(o);
			
		}
		
		
	}

}
