package RestaurantManagement;

import java.util.*;


public class MenuApp extends Bill{
	Scanner sc=new Scanner(System.in);
	static double finlamount=0;
	FoodsItem fi=new FoodsItem();
	ResturantApp custlist =new ResturantApp();
	RestuarantOwner admin=new RestuarantOwner();
    List<OrderItem>Foodorder=new ArrayList<>();
    HashSet<Customer>cust=new HashSet<>();

    double amount=0;

public void getMainMenu() {
	System.out.println("1. Register as Customer");
	System.out.println("2. Login as Customer");
	System.out.println("3. Login as Owner");
	System.out.println("4. Exit");
	System.out.print("Select option :");
			
}
public void getCustomerMenu() {
	System.out.println("1. View Menu");
	System.out.println("2. Search Item");
	System.out.println("3. Place Order");
	System.out.println("4. View My Order");
	System.out.println("5.Generate Bill");
	System.out.println("6.LogOut");
	System.out.print("Select the option :");

}
public void FoodMenu() {
	boolean flag=true;
	while(flag) { 	
		getCustomerMenu();
int	cm=sc.nextInt();
	switch(cm) {
	case 1:fi.getFoodItem();
	      break;
	case 2:
		System.out.print("Enter the Food item :");
		String foodItem =sc.next();
		fi.searchItem(foodItem);
		break;
	case 3:
		fi.getFoodItem();
		System.out.print("Write the item :");
		String si=sc.next(); 
		System.out.print("Enter the quantity :");
		int quantity =sc.nextInt();
		OrderItem oi=new OrderItem(si, quantity,quantity*fi.fooditems.get(si));
		 amount=amount+quantity*fi.fooditems.get(si);
	     Foodorder.add(oi);
	      finlamount=finlamount+amount;
	     System.out.println("Order Placed Succesful");
	    break;
	case 4:
		for (OrderItem item : Foodorder) {
		    System.out.println(item);  // automatically calls toString()
		}		break;
	case 5:
		generateBill(amount);
		
		break;
	case 6:
		flag =false;

	}
}
}
public void getOwnerMenu() {
	System.out.println("1. Add Menu Item");
	System.out.println("2. Update Menu");
	System.out.println("3. Delete Menu");
	System.out.println("4. View All Customers");
	System.out.println("5. View All Orders");
	System.out.println("6. Generate Sales Report");
	System.out.println("7. LogOut");
	System.out.println("Select the Option :");
    
}
@Override
public String toString() {
	return "Foodorder=" + Foodorder ;
}
public void adminMenu() {
	boolean flag1=true;
	while(flag1) {
		getOwnerMenu();
		int selection =sc.nextInt();
		switch(selection) {
		case 1: admin.addMenu(fi.fooditems);
		break;
		case 2:admin.updateMenu(fi.fooditems);
		break;
		case 3:admin.deleteitem(fi.fooditems);
		break;
		case 4:admin.viewCustomers(cust);
		break;
		case 5:admin.viewAllorder(Foodorder);
		break;
		case 6:
			    admin.genrateSalesReport(Foodorder);
                saleReport(finlamount);
               		break;
		case 7:System.out.println("Thanks For Modification");
			  flag1=false;
		break;
		default:System.out.println("Invalid option");
		
		}
		
	}
}
public void getMainResturantMenu() {
	 boolean flag2=true;
	    while(flag2) {
	    	getMainMenu();
	    	int op=sc.nextInt();
	    	switch(op) {
	    	case 1:
	    		System.out.print("Enter the name :");
	    		String name =sc.next();
	    		             sc.nextLine();
	    	    System.out.print("Enter the phone Number :");
	    	    String number =sc.next();
	    	                   sc.nextLine();
	    	    Customer cs =new Customer(name, number);
	    	    boolean exists = false;

	    	    for (Customer c : cust) {
	    	        if (c.getName().equals(cs.getName()) && c.getNumber().equals(cs.getNumber())) {
	    	            exists = true;
	    	            break;
	    	        }
	    	    }

	    	    if (exists) {
	    	        System.out.println("User already exists");
	    	    } else {
	    	        cust.add(cs);
	    	        System.out.println("Registration is successful");
	    	        System.out.println("Customer Id: " + cs.getId());
	    	        System.out.println("--------------------------");
	    	        FoodMenu();
	    	    }
	    		break;
	    	case 2:
	    		System.out.print("Enter the Id :");
	    		String id=sc.next();
	    		        sc.nextLine();
	    		System.out.print("Enter the name :");
	    		String custname=sc.next();
	    		for(Customer cust1:cust) {
	    		    if((cust1.getId().equals(id))&&(cust1.getName().equals(custname))) {
	    		    FoodMenu();
	    		    }
	    		    else {System.out.println("Oops! You are not registered User...");}
	    		    System.out.println("------------------");
	    		} break;
	    	case 3:
	    		int attem=3;

	    		while(attem>=0) {
	    		System.out.print("Enter the Owner User name :");
	    		String Owneruser=sc.next();
	    		       sc.nextLine();
	    		System.out.print("Enter the password");
	    		String password =sc.next();
	    		
	    		if(Owneruser.equals("Admin")&&password.equals("123456789")) {
	    			adminMenu();
	    			attem=0;
	    		}
	    		else {System.out.println("Worng user name or password...!");}
	    		attem--;
	    		}
	    		break;
	    	case 4:
	    		System.out.println("Thank You...!\nVisit Again....");
	    		flag2=false;
	    		break;
	    	default:System.out.println("Invalid Option");
	    
	    	}
	    }
}


}
