package RestaurantManagement;

import java.util.*;

public class RestuarantOwner extends FoodsItem {
    Scanner sc = new Scanner(System.in);

    public void addMenu(HashMap<String, Integer> fooditems) {
       
    	System.out.println("Enter name of food Item :");
        String item = sc.next();
        System.out.println("Enter the rate :");
        int rate = sc.nextInt();
        fooditems.put(item, rate);
        if(fooditems.containsKey(item)&&fooditems.containsValue(rate)) {
        	System.out.println("Succesfully Item is added....");
        
        }
        else {
        	System.out.println("oops item is not added to menu...!");
        }
        System.out.println("------------------------");

    }

    public void updateMenu(HashMap<String, Integer> fooditems) {
        System.out.println("Enter item name to update :");
        String updateitem = sc.next();
            System.out.println("Enter new rate :");
            int newrate = sc.nextInt();
            fooditems.put(updateitem, newrate);
            if(fooditems.containsKey(updateitem)&&fooditems.containsValue(newrate)) {
            	System.out.println("Item succesfully updated..");
            }
            else {
            	System.out.println("Oops updation failed..!");
            }
            System.out.println("------------------------");

    }

    public void deleteitem(HashMap<String, Integer> fooditems) {
        System.out.println("Enter the item name to delete :");
        String deleteItem = sc.next();
            fooditems.remove(deleteItem);
            if(fooditems.containsKey(deleteItem)) {
            	System.out.println("Item is not deleted..!");
            }else {
            	System.out.println(" Deletion is succesful... ");
            }
            System.out.println("------------------------");

    }

    public void viewCustomers(HashSet<Customer> cust) {
        System.out.println("\n=====  Customer List =====");
        for (Customer c : cust) {
            System.out.println(c);
            System.out.println("------------------------");
        }
    }

    public void viewAllorder(List<OrderItem> allOrders) {
        System.out.println("\n=====  All Orders =====");
        for (OrderItem order : allOrders) {
            System.out.println(order);
            System.out.println("----------------------");
        }
    }
    public void genrateSalesReport(List<OrderItem> Salesreport) {
   
    	    if (Salesreport.isEmpty()) {
    	        System.out.println("No sales yet!");
    	        return;
    	    }

    	    // HashMap to store total quantity of each food item
    	    Map<String, Integer> totalSales = new HashMap<>();

    	    for (OrderItem order : Salesreport) {
    	        String item = order.getItem();
    	        int qty = order.getQuantity();

    	        // Add the quantity for the same item
    	        totalSales.put(item, totalSales.getOrDefault(item, 0) + qty);
    	    }

    	    // Print neatly
    	    System.out.println("\n========= SALES REPORT =========");
    	    for (Map.Entry<String, Integer> entry : totalSales.entrySet()) {
             	System.out.println("Item         Quantity");

    	        System.out.println(entry.getKey() + "          " + entry.getValue());
    	    }
    	    System.out.println("================================");
    	}

}

		
	

	

