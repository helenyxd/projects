import java.util.ArrayList;

/**
 * Exercise Two, Data Structures Homework 2
 * @author Helen Dong
 */

public class ConsecutiveThree {
	
	public static void main(String[] args) {
		
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> out = new ArrayList<String>();
		strings.add("hello");
		strings.add("my");
		strings.add("name");
		//smallestOfThree(strings, out, strings.size());
		strings.add("is");
		strings.add("Helen");
		strings.add("Dong");
		smallestOfThree(strings, out, strings.size());
		
	}
	
	public static void smallestOfThree(ArrayList<String> strings, ArrayList<String> out, int length) {
		
		// when finished, will print the string elements in ArrayList<String> out
		
		if (length >= 3) {
			
			int first = strings.get(0).length();
			int second = strings.get(1).length();
			int third = strings.get(2).length();
			
			if (first < second) {
				
				if (first < third) {
					
					out.add(strings.get(0));	
					
				}
				
				else {
					
					out.add(strings.get(2));
					
				}
				
			}
			
			else {
				
				if (second < third) {
					
					out.add(strings.get(1));
					
				}
				
				else {
					
					out.add(strings.get(2));
					
				}
				
			}
			
		}
		
		if (length > 3) {
			
			strings.remove(0);
			strings.remove(1);
			strings.remove(2);
			ArrayList<String> newStrings = strings;
			smallestOfThree(newStrings, out, length - 3);
		
		}
		
		if (length == 3) {
			
			int n = out.size();
			
			for (int i = 0; i < n; i++) {
				
				System.out.println(out.get(i));
			
			}
			
		}
		
	}

}
	

