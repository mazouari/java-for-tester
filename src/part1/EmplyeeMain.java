package part1;

public class EmplyeeMain {

	public static void main(String[] args) {
		//Creating Object ==> is an instance of Class
		
		Employee emp1 = new Employee();
		emp1.eid=1011;
		emp1.ename="Ali";
		emp1.job="Test auto";
		emp1.deptno = 15;
		emp1.sal=80.00;
		emp1.display();
				
		//Creating Object 2 ==> is an instance of Class
		Employee emp2 = new Employee();
		emp2.eid=1012;
		emp2.ename="Mohamed";
		emp2.job="Test auto";
		emp2.deptno = 92;
		emp2.sal=90.00;
		emp2.display();
				
	}

}
