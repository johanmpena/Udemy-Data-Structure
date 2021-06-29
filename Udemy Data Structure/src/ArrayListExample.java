import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 4567));
		employeeList.add(new Employee("Mary", "Smith", 22));
		employeeList.add(new Employee("Mike", "Wilson", 3245));
		
		// employeeList.forEach(employee -> System.out.println(employee));
		
		// Index is provided, so it is constant time O(1).
		// System.out.println(employeeList.get(1));
		
		// System.out.println(employeeList.isEmpty());
	
		// Replace employee.
		employeeList.set(1, new Employee("John", "Adams", 4568));
	
		// employeeList.forEach(employee -> System.out.println(employee));
		
		// Get the list size.
		// System.out.println(employeeList.size());
		
		// Adding to the list. Worst case is O(n).
		employeeList.add(3, new Employee("John", "Doe", 4567));
		// employeeList.forEach(employee -> System.out.println(employee));
		
		// Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		// for (Employee employee: employeeArray) {
		//	System.out.println(employee);
		// }
		
		System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
		
		// Get index of an element.
		System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
		
		// Remove from list.
		employeeList.remove(2);
		employeeList.forEach(employee -> System.out.println(employee));
	}
}
