package JavaKamp.CoffeeShopHomework.Abstracts;

import JavaKamp.CoffeeShopHomework.Entities.Customer;

public interface CustomerCheckService {

     boolean checkIfRealPerson(Customer customer) throws Exception;

}
