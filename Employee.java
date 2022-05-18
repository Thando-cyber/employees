
public abstract class Employee {
   private String Name;
   private char Gender;
   private int age ;
   private String Address;
   private double Salary ;
	
   public Employee() {
      Name = Address = "";
      Gender = ' ';
      age = 0;
      Salary = 0.0;
   	
   }
   public Employee(String Name, char Gender ,int age,String Address,double salary){
      this.Name = Name;
      this.Gender= Gender;
      this.age= age;
      this.Address = Address;
      this.Salary = salary;
   }
   public String getName() {
      return Name;
   	
   }
   public void setAge(int age) {
      if (age<=0 || age> 100) {
         throw new  IllegalArgumentException("Age incorrect");
      }else{
         this.age = age;
      }
   	
   }
   public void setAddress(String Address ) {
      if (Address == null) {
         throw new  IllegalArgumentException("Address incorrect");
      }else{
         this.Address = Address;	
      }
   }
   public void setSalary(double Salary) {
      this.Salary= Salary;
   }
	
   public abstract double CalcSalary();
	
   public String toString() {
      return Name+","+Gender+","+age+","+Address+","+Salary ;
   }	
}