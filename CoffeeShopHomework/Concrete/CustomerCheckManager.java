package JavaKamp.CoffeeShopHomework.Concrete;

import JavaKamp.CoffeeShopHomework.Abstracts.CustomerCheckService;
import JavaKamp.CoffeeShopHomework.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
