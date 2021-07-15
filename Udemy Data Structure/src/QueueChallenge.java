
public class QueueChallenge {

	public static void main(String[] args) {
		// should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
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
		QueueChallengeStackImplementation stack = 
				new QueueChallengeStackImplementation(string.length());
		
		// Create queue.
		QueueChallengeImplementation queue =
				new QueueChallengeImplementation(string.length());
		
		// Add to stack and queue.
		for(int i = 0; i < string.length(); i++) {
			stack.push(string.charAt(i));
			queue.add(string.charAt(i));
		}
		
		// Compare queue with stack.		      
		
		while(compare == true && !stack.isEmpty()) {
			if(queue.remove() != stack.pop()) 
				compare = false;
		}
		
		return compare;
    }
}
