package exercise14_employee;

public class MainEmployee {

	public static void main(String[] args) {
		//make the object of Employee(id, firstName, lastName, salary)
		Employee e1 = new Employee(1313617032, "Hafizhun", "Alim", 100000);
		System.out.println("ID: " + e1.getID());
		System.out.println("First Name: " + e1.getFirstName());
		System.out.println("Last Name: " + e1.getLastName());
		System.out.println("Full Name: " + e1.getName());
		System.out.println("Salary: " + e1.getSalary());
		System.out.println();
		
		Employee e2 = new Employee(1313617032, "Anak", "Ayam", 200000);
		System.out.println("ID: " + e2.getID());
		System.out.println("First Name: " + e2.getFirstName());
		System.out.println("Last Name: " + e2.getLastName());
		System.out.println("Full Name: " + e2.getName());
		System.out.println("Salary: " + e2.getSalary());
		System.out.println("Annual Salary: " + e2.getAnnualSalary());
		System.out.println("Amount of Salary raised: " + e2.raiseSalary(15));
		System.out.println();
	}
}
