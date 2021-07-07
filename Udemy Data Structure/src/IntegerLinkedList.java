
public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void insertSorted(Integer value) {
    	
    	// Check if the list is empty.
    	if(head == null) {
    		/* If the list is empty
    		 * add the value to front. */
    		addToFront(value);
    		return; 
    	}
    	
    	// Add the value to the front.
    	addToFront(value);
    	
    	/* If the list is not empty, 
    	 * compare the value to the rest of the list.*/
    	IntegerNode current = head;
    	while(current.getNext() != null) {
    		/* If the value of the node
    		 * is bigger then the next one,
    		 * swap the node. */
    		if(current.getValue() > current.getNext().getValue()) {
    			// Create copy node.
    			IntegerNode copy = new IntegerNode(current.getValue());
    			
    			/* Set the value of the current 
    			 * node to the value of the next node. */
    			current.setValue(current.getNext().getValue());
    			
    			/* Then set the value of the next node 
    			 * to value of the copy node. */
    			current.getNext().setValue(copy.getValue());
    		}
    		
    		// Set current to next.
    		current = current.getNext();
    	}
    	
    	// Increase size.
    	size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}

