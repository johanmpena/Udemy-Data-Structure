import java.util.NoSuchElementException;

public class QueueChallengeImplementation {

	private Character[] queue;
	private int front;
	private int back;
	
	public QueueChallengeImplementation(int capacity) {
		queue = new Character[capacity];
	}
	
	// Circular Implementation.
	public void add(Character character) {
		if(size() == queue.length - 1) {
			int numItems = size();
			Character[] newArray = new Character[2 * queue.length];
			
			System.arraycopy(queue, front, newArray, 0, queue.length - front);
			System.arraycopy(queue, 0, newArray, queue.length - front, back);
			
			queue = newArray;
			
			front = 0;
			back = numItems;	
		}
		
		queue[back] = character;
		if(back < queue.length - 1) {
			back++;
		}
		else {
			back = 0;
		}
	}
	
	public Character remove() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		
		Character character = queue[front];
		queue[front] = null;
		front++;
		if (size() == 0) {
			front = 0;
			back = 0;
		}
		else if (front == queue.length) {
			front = 0;
		}
		return character;
	}
	
	public Character peek() {
		if (size() == 0) {
			throw new NoSuchElementException();
		}
		
		return queue[front];
	}
	
	public int size() {
		if (front <= back) {
			return back - front;
		}
		else {
			return back - front + queue.length;
		}
	}
	
	public void printQueue() {
		if (front <= back) {
			for (int i = front; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
		else {
			for (int i = front; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
			for (int i = 0; i < back; i++) {
				System.out.println(queue[i]);
			}
		}
	}

}
