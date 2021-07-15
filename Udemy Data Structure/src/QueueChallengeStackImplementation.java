import java.util.EmptyStackException;

public class QueueChallengeStackImplementation {

	private Character[] stack;
	private int top; 
	
	public QueueChallengeStackImplementation(int capacity) {
		stack = new Character[capacity];
	}
	
	public void push(Character character) {
		if (top == stack.length) {
			// Need to resize the backing array.
			Character[] newArray = new Character[2 * stack.length];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		
		stack[top++] = character;
	}
	
	public char pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		char character = stack[--top];
		stack[top] = null;
		return character;
	}
	
	public Character peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return stack[top - 1];
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top == 0;
	}
	
	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
}
