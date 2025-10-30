package RestaurantManagement;

import java.util.*;

public class FoodsItem {
	HashMap<String, Integer> fooditems = new HashMap<>();{
	fooditems.put("rice", 200);
	fooditems.put("noodles", 150);
	fooditems.put("pizza", 300);
	fooditems.put("burger", 180);
	fooditems.put("pasta", 220);
	fooditems.put("fried chicken", 250);

	}
	public void getFoodItem() {
		for (Map.Entry<String, Integer> entry : fooditems.entrySet()) {
            System.out.println("Food: " + entry.getKey() +" Price :" + entry.getValue());
		}
	}
	
	public void searchItem(String searchItem) {
		if(fooditems.containsKey(searchItem)) {
		System.out.println(fooditems.get(searchItem));}
		else {System.out.println("Item not present");}
		
	}
	
}
