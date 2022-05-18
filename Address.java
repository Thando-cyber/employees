
public class Address{
	private String Street;
	private String City;
	private int Postal_Code;
	

	public Address() {
		Street = City = "";
		Postal_Code= 0;
		
	}
	public Address(String Street,String City, int Postal) {
		this.City= City;
		this.Street = Street;
		this.Postal_Code = Postal;
	}
	public void setSreet(String Street) {
		if (Street == null || Street == "" ) {
			throw new IllegalArgumentException("Street name cannot be empty");
		}else {
			this.Street = Street;
		}
		
	}
	public void setCity(String City) {
		if(City== null || City == "") {
			throw new IllegalArgumentException("City name cannot be empty");
		}else {
			this.City = City;
		}
		
	}
	public void setPostal(int Postal) {
		this.Postal_Code = Postal;
	}
	
	
	public String toString() {
		return Street+","+City+","+Postal_Code;
	}
}


