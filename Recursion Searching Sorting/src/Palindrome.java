
public class Palindrome {
	
	public static void main(String[] args) {
		
		boolean palindrome = false;
		isPalindrome("kayak", 0, 4);
		isPalindrome("hello", 0, 4);
		isPalindrome("KaYAk", 0, 4);
		isPalindrome("k.ayak", 0, 4);
		
	}
	
	public static void isPalindrome(String s, int start, int end) {
		
		s = s.replaceAll("[^a-zA-Z ]", "");
		
		if (start == end) {
			
			if (s.substring(start, start + 1).equalsIgnoreCase(s.substring(end, end + 1))) {
				
				System.out.println(true);
				return;
				
			}
			
			else {
			
				System.out.println(false);
				return;
				
			}
			
		}
		
		if (s.substring(start, start + 1).equalsIgnoreCase(s.substring(end, end + 1))) {
			
			isPalindrome(s, start + 1, end - 1);
			
		}
		
		else if (!s.substring(start, start + 1).equalsIgnoreCase(s.substring(end, end + 1))) {
			
			System.out.println(false);
			return;
				
		}
		
	}
		
	}

