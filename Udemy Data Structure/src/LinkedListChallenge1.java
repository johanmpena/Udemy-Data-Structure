
public class LinkedListChallenge1 {

	/* Implement an addBefore() method
	 * for the EmployeeDoublyLinkedList class. */
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);
        //System.out.println(list.getSize());
        //list.printList();

        list.addBefore(billEnd, johnDoe);
		list.addBefore(new Employee("Someone", "Else", 1111), mikeWilson);
        //System.out.println(list.getSize());
		list.printList();

    }
}
