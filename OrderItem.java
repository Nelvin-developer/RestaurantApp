package RestaurantManagement;


class OrderItem {
    String name;
    int quantity;
    int price;

    public OrderItem(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    

	@Override
	public String toString() {
		return "name =" +    name + "| quantity=" + quantity + "| price=" + price ;
		
	}



	
	
	 public String getItem() {
	        return name;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public int getPrice() {
	        return price;
	    }
}
