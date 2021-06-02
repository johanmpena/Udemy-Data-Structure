/* 
 * Video 13 to 15.
 * Operation and time complexity.
 * ------------------------------
 * Retrieve with index: O(1).
 * Retrieve without index: O(n).
 * Add an element to a full array: O(n).
 * Add a element to the end of an array(has space): O(1).
 * Insert or update an element at a specific index: O(1).
 * Delete an element by setting to null(has index): O(1).
 * Delete an element by setting to null(no index): O(n).
 * Delete an element by shifting elements: O(n).
 */

public class Arrays {
	
	public static void main(String[] args) {
		int[] intArray = new int[7];  // Once created can't change size.
	
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		int index = -1;
		for(int i = 0; i < intArray.length; i++) {
			if (intArray[i] == 7) {
				index = i;
				break;
			}
		}
		
		System.out.println("index = " + index);
	}
}
