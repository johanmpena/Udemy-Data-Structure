
public class StackChallenge {

	public static void main(String[] args) {
		
		// Should return true.
		System.out.println(checkForPalindrome("abccba"));
		
		// Should return true.
		System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
		
		// Should return true.
		System.out.println(checkForPalindrome("I did, did I?"));
		
		// Should return false.
		System.out.println(checkForPalindrome("hello"));
		
		// Should return true.
		System.out.println(checkForPalindrome("Don't nod"));
	}
	
	public static boolean checkForPalindrome(String string) {
		/* Boolean variable.
		 * Variable is used to look for mismatch. */
		boolean compare = true;
		
		// Clear white spaces.
		string = string.replace(" ", "");
		
		// Remove punctuation.
		string = string.replaceAll("\\p{Punct}", "");
		
		// Convert to lower case.
		string = string.toLowerCase();
		
		// Create stack.
		StackChallengeImplementation stack = 
				new StackChallengeImplementation(string.length());
		
		for(int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
		}
		
		for(int i = 0; compare == true && !stack.isEmpty(); i++) {
			if(string.charAt(i) != stack.pop()) 
				compare = false;
		}
		
		return compare;
	}	
}
