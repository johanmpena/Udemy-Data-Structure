
public class SortChallenge2 {

	/* Change insertion sort so that it uses recursion. */
	public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        int[] sortedArray = new int[6];
        
        int firstUnsortedIndex = 1;
        sortedArray = sort(firstUnsortedIndex, intArray);
       

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
	}
	
	public static int[] sort(int firstUnsortedIndex, int[] intArray) {
		//System.out.println(firstUnsortedIndex);
		
		int length = intArray.length;
		//System.out.println(length);
		
		// Break 
		if(firstUnsortedIndex >= length) {
			return intArray;
		}
		
		int newElement = intArray[firstUnsortedIndex];
		int i;
		for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
			intArray[i] = intArray[i - 1];
		}
		
		intArray[i] = newElement;
		return sort(++firstUnsortedIndex, intArray);
	}
}