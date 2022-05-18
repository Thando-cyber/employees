import java.util.ArrayList;

import java.util.Scanner;
import java.util.Iterator;
public class EmployeeTester {
	static ArrayList<String> empList = new ArrayList<String>();
	
	
	public static String getAddress(Scanner in){
		String street=" ";
		String city = " ";
		int Postal=0;
		System.out.print("Enter Street Name :");
		street = in.nextLine();
		System.out.print("Enter City Name : ");
		city = in.next();
		System.out.print("Enter Postal Address : ");
		Postal = in.nextInt();
		Address obj = new Address(street,city,Postal);
		return  obj.toString();
	}
	
	public static String getEmployee(Scanner in) {
		String Name= " ";
		char Gender =' ';
		int age = 0;
		String Address = " ";
		double salary= 0.0;
		String ans = "";
		System.out.print("Enter Employee Name : ");
		Name = in.next();
		System.out.print("Enter Employee Gender(F/M) :");
		Gender = in.next().charAt(0);
		System.out.print("Enter Emoloyee age: ");
		age = in.nextInt();
		Address = getAddress(in);
		System.out.print("Are they a full time Employee or  Part time (f or t): ");
		char employeeStatus = in.next().charAt(0);
		if (employeeStatus == 'f') {
			System.out.print("What is the base salary before tax: ");
			double baseSal =in.nextDouble();
			System.out.print("What is the tax Rate: ");
			double taxRate = in.nextDouble();
			FullTimeEmployee obj = new FullTimeEmployee(Name,Gender, age, Address,baseSal,taxRate);
			salary = obj.CalcSalary();
			ans =  obj.toString();
		}else if (employeeStatus == 't'){
			System.out.print("How many hours did they work: ");
			int numHours =in.nextInt();
			System.out.print("What is the pay rate: ");
			double payRate= in.nextDouble();
			PartTimeEmployee obj = new PartTimeEmployee(Name,Gender,age,Address,numHours,payRate);
			salary = obj.CalcSalary();
			ans = obj.toString();
		}
		
		return ans;
	}
	

	public static int searchEmployee(String Name) {
		int pos =0;
		for (int i = 0; i< empList.size(); i++) {
				if(empList.get(i) == Name) {
					pos = i+1;	
				}
		}
		return pos;
	}
	/*public static String displaySalary(String Name) {
		int pos = searchEmployee(Name);
		
		
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empList.add("Emma");
		int Choice =0;
		Scanner scan = new Scanner(System.in);
		while (Choice != -1) {
			System.out.println("1 – Register an employee");
			System.out.println("2 – Pay salary");
			System.out.println("3 – Display salary");
			System.out.println("-1 to stop");
			System.out.print("Enter your choice (1, 2, 3 or -1): ");
			Choice = scan.nextInt();
			if (Choice == 1) {
				
				String empl =  getEmployee(scan);
				empList.add( empl);
				
			}
		
		}
		
		
		scan.close();
	}

}
