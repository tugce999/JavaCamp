package Concrete;

import Abstract.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	ICustomerCheckService _customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			throw new Exception("Not a valid person");
		}
	}

}

