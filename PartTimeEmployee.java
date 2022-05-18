
public class PartTimeEmployee extends Employee{
	private int numHours;
	private double payRate;
	public PartTimeEmployee() {
		super();
		numHours = 0;
		payRate = 0.0;
	}
	public PartTimeEmployee(String Name, char gender,int age,String address,int numHours,double payRate){
		super(Name,gender,age,address,numHours);
		this.numHours = numHours;
		this.payRate = payRate;
	}
	public void setNumHours(int numHours) {
		if(numHours<0){
			throw new IllegalArgumentException("Number hours worked incorrect"); 
		}else {
			this.numHours = numHours;
		}
	}
	public void setNumHours(double payRate) {
		if(payRate<0){
			throw new IllegalArgumentException("Number hours worked incorrect"); 
		}else {
			this.payRate = payRate;
			
		}
	}
	public double CalcSalary() {
		return numHours*payRate;
	}
	
	public String toString() {
		return numHours+","+payRate+super.toString();
	}
	

}
