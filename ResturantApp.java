package RestaurantManagement;

//import java.sql.Connection;
//import java.sql.DriverManager;

public class ResturantApp {

	public static void main(String[] args) {

   MenuApp m=new MenuApp();
    System.out.println("--Welcome to Java Resturant--");
  
    m.getMainResturantMenu();
    // used to connect to the database 
//    try {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection con = DriverManager.getConnection(
//            "jdbc:mysql://localhost:3306/test", "root", ""
//        );
//        System.out.println("✅ MySQL Connected Successfully!");
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
	}
	
	
	}


