/*
 * Video 24 to 25.
 * Time complexity.
 * ----------------
 * Best case: O(n).
 * Worst case: O(n^2).
 * In-place algorithm(doesn't use extra memory).
 * Advantages: doesn't require as much shifting as insertion sort.
 * Disadvantages: not as efficient as the merge, heap, and quick sort.
 * Unstable sort(does not keep the order of duplicate items).
 */

public class ShellSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int gap = intArray.length / 2; gap > 0; gap /= 2) {
			
			for(int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				
				int j = i;
				
				while(j >= gap && intArray[j - gap] > newElement) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				
				intArray[j] = newElement;
			}
		}
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
}
