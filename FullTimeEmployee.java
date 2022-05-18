
public class FullTimeEmployee extends Employee{
	private double baseSalary;
	private double taxRate ;
	
	
	
	public FullTimeEmployee() {
		super();
		baseSalary = 0.0;
		
	}
	public FullTimeEmployee(String Name, char Gender, int age, String Address, double baseSalary,double taxRate) {
		super(Name, Gender, age, Address,baseSalary);
		this.baseSalary = baseSalary;
		this.taxRate = taxRate;
		
	}
	public void setBaseSalary(double baseSalary) {
		if (baseSalary<=0){
			throw new  IllegalArgumentException("Salary incorrect");
		}else{
			this.baseSalary = baseSalary;
		}
	}
	public void settaxRate(double taxRate) {
		if (taxRate<=0){
			throw new  IllegalArgumentException("Tax Rate incorrect");
		}else{
			this.taxRate = taxRate;
			
		}
	}
	public double CalcSalary() {
		return baseSalary*taxRate;
	}
	public String toString() {
		return baseSalary+","+taxRate+super.toString();
	}
	

}
