package RestaurantManagement;

public  class Customer {
	
	
	private String name;
	private String number; 
	private String id;
	private static int count=1000;
	
	public Customer(String name, String number) {
		count++;

		this.name = name;
		this.number = number;
		this.id="CUST"+count;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public String setNumber(String number) {
		return this.number = number;
	}
	public String getId() {
		 return this.id = id;
		 }
		
	
	
	@Override
	public String toString() {
		return "\n Customer name=" + name + "\n Customer number=" + number + "\n Customer id=" + id  ;
	}
}
