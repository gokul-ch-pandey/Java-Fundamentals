package in.com.hikex.copyconstructor;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("gokul", "pandey", 26);
		Employee emp2 = new Employee(emp1);
		Employee emp3 = null;
		try {
			emp3 = (Employee) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(emp1.getfName() + " , " + emp1.getlName() + ","
				+ emp1.getAge());
		System.out.println(emp2.getfName() + " , " + emp2.getlName() + ","
				+ emp2.getAge());
		System.out.println(emp3.getfName() + " , " + emp3.getlName() + ","
				+ emp3.getAge());

	}

}
