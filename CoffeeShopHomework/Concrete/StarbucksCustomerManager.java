package JavaKamp.CoffeeShopHomework.Concrete;

import JavaKamp.CoffeeShopHomework.Abstracts.BaseCustomerManager;
import JavaKamp.CoffeeShopHomework.Abstracts.CustomerCheckService;
import JavaKamp.CoffeeShopHomework.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
   private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void save(Customer customer) throws Exception {

        if (customerCheckService.checkIfRealPerson(customer)) {
            super.save(customer);
        }else
            throw new Exception();

    }

}
