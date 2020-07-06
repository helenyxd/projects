
public class BinaryZeroes {
	
	public static void main(String[] args) {
		
		countZeroes(4, 0);
		countZeroes(8,0);
		countZeroes(10, 0);
		countZeroes(0, 0);
		
	}
	
	public static void countZeroes(int n, int count) {
		
		if (n == 0) {
			
			System.out.println("0");
			return;
			
		}
		
		if (n == 1) {
			
			System.out.println(count);
			return;
			
		}
		
		if (n % 2 == 0) {
			
			count++;
			
		}
		
		if (n > 0) {
			
			countZeroes(n/2, count);
			
		}
		
	}

}
