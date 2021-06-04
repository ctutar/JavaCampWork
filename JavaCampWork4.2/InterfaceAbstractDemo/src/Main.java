import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		
		Customer c1 = new Customer(1, "Cansu", "Tutar", 2000, "12345678910");
	
	}
}
