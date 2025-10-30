package RestaurantManagement;


public class Bill  {
double GSTrate=5;
double GSTrate1=18;

double billAmount =0;
double GSTamount =0;
 public void generateBill(double amount) {
	 System.out.println("======Restuarant Bill======");
	 System.out.println("The total amount is"+amount);
	 GSTamount=(amount*GSTrate)/100;
	 billAmount=amount+GSTamount;
	 System.out.println("The amount  to needed to pay after adding GST:"+billAmount);
	 System.out.println("---------------------------");
 }
	public void saleReport(double finlamount) {
		System.out.println("Total Revenue(before GST) :"+finlamount);
		GSTamount=(finlamount*GSTrate1)/100;
		System.out.println("GST(18%) :"+GSTamount);
		System.out.println("Final Rate :"+(GSTamount+finlamount));
	}
}
