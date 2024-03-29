/* HashTable - Challenge 2
 * -------------------------
 * Remove duplicate items from a linked list.
 * Your solution must use the JDK's LinkedList class.
 * Your solution must use a HashMap.
 * Use the starter project in the resources section. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HashTableChallenge2 {

	public static void main(String[] args) {
		
		LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678)); 		// This should be removed.
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));		// This should be removed.

        employees.forEach(e -> System.out.println(e));
      
        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            }
            else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Employee employee: remove) {
            employees.remove(employee);
        }

        System.out.println("-------------------------");
        employees.forEach(e -> System.out.println(e));
	}
	
	public static int hash(int value) {
		return Math.abs(value % 10);
	}
}


/*  Use an for-each loop to traverse the list.	
 *  Then use indexOf() and lastIndexOf(),
 *  to check for duplicates.					
for(Employee e: clone) {
	/* If the first index of e does not match 
	 * it's last index, then it is a duplicate. 
	if(employees.indexOf(e) != employees.lastIndexOf(e)) {
		employees.remove(employees.lastIndexOf(e));
	}
} */
