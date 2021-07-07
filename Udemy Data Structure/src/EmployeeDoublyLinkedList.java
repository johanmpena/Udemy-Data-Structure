

public class EmployeeDoublyLinkedList {

	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		
		if (head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		
		head = node;
		size++;
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode  node = new EmployeeNode(employee);
		if(tail == null) {
			head = node;
		}
		else { 
			tail.setNext(node);
			node.setPrevious(tail);
		}
		
		tail = node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		
		EmployeeNode removedNode = head;
		
		if(head.getNext() == null){
			tail = null;
		}
		else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public EmployeeNode removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = tail;
		
		if (tail.getPrevious() == null) {
			head = null;
		}
		else {
			tail.getPrevious().setNext(null);
		}
		
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD - > ");
		while (current != null) {
			System.out.println(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
	 public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

	        /* return true if you were able to successfully add the employee
	         * into the list before the existing employee. Return false
	         * if the existing employee doesn't exist in the list
			 * add your code here */
		 	
		 	if(head == null) {
		 		return false;
		 	}
		 	
		    EmployeeNode current = head;
		 	
		 	// First check to see if employee is in list.
		    boolean found = false;
		 	while (current != null && found == false) {
		 		if(current.getEmployee().equals(existingEmployee)) {
		 			found = true; 
		 			break;
				}
		 			
		 		current = current.getNext();
		 	}

		 	if(found == false) {
		 		System.out.println("No employee by that name exist.");
		 		return false;
		 	}
		 	else {
		 	    EmployeeNode node = new EmployeeNode(newEmployee); 
		 	
		 	    node.setNext(current);
		 	   
		 	    if(current.getPrevious() == null) {
		 	    	head = node;
		 	    }
		 	    else {
		 	    	node.setPrevious(current.getPrevious());
		 	    	node.getPrevious().setNext(node);
		 	    }
		 	    
		 	    current.setPrevious(node);
		 	    
		 		size++;
		 		
		 		return found;
		 	}
	}
	 
}
