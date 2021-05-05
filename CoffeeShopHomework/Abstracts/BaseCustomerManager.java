package JavaKamp.CoffeeShopHomework.Abstracts;

import JavaKamp.CoffeeShopHomework.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerCheckService{

    public void save(Customer customer) throws Exception {
        System.out.println(customer.getFirstName() + " kaydedildi.");
    }

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return false;
    }
}
