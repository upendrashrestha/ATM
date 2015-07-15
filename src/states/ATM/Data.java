package states.ATM;

import java.util.Hashtable;

import extendedClass.Current;
import extendedClass.Customer;
import extendedClass.Saving;

public class Data {

	private static Hashtable<String, Customer> customerHash = new Hashtable<String, Customer>();
	
	public void setCustomer(){
		
		// Accounts
		Current current1 = new Current("Current Account", 4000);
		Current current2 = new Current("Current Account", 6000);
		Saving saving1 = new Saving("Saving Account", 4000);
		
		// Cards
		String card1 = "1";
		String card2 = "2222333344445555";
		String card3 = "3333444455556666";
		
		Customer cust1 = new Customer("Sajala Maharjan", "1000 N. 4th Street, Fairfield, IA 52557", current1, card1, "1234" );
		Customer cust2 = new Customer("Narendra Thapa Magar", "1000 N. 4th Street, Fairfield, IA 52557", current2, card2, "1234");
		Customer cust3 = new Customer("Upendra Shrestha", "1000 N. 4th Street, Fairfield, IA 52557", saving1, card3, "1234");
		
		customerHash.put(card1, cust1);
		customerHash.put(card2, cust2);
		customerHash.put(card3, cust3);
	}
	
	public static Customer getCustomer(String card){
		
		return customerHash.get(card);
	}
}
