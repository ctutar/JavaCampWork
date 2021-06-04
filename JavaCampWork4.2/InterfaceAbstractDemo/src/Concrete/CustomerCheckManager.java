package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class CustomerCheckManager implements ICustomerCheckService{


	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
}
