
/**
 * Exercise One, Data Structures Homework 2
 * @author Helen Dong
 */

public class ReversedString {
	
	public static void main(String[] args) {
		
		isReversed("hel lo", "olleh");
		isReversed("hello", "olleh");
		isReversed("hello", "nihao");
		isReversed("hello", "hi");
		isReversed("a", "a");
		
	}
	
	public static void isReversed(String s1, String s2) {
		
		// will print 1 if the strings are reversed, 0 if they are not
		// running time is O(1)
		
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		
		if (s1.length() != s2.length()) {
			
			System.out.println("0");
			return;
			
		}
		
		if (s1.length() == 1 && s2.length() == 1) {
			
			if (s1.equalsIgnoreCase(s2)) {
				
				System.out.println("1");
				
			}
			
			else {
				
				System.out.println("0");
				
			}
			
		}
		
		if (s1.length() > 1 && s2.length() > 1) {
			
			String sub1 = s1.substring(0, s1.length() - 1);
			String sub2 = s2.substring(1, s2.length());
			isReversed(sub1, sub2);
			
		}
		
	}

}
