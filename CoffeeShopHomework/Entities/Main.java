package JavaKamp.CoffeeShopHomework.Entities;

import JavaKamp.CoffeeShopHomework.Abstracts.BaseCustomerManager;
import JavaKamp.CoffeeShopHomework.Adapters.MernisServiceAdapters;
import JavaKamp.CoffeeShopHomework.Concrete.StarbucksCustomerManager;

public class Main {
    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapters());
        customerManager.save(new Customer("44444528282","Ecem","Akçay",2000));


    }
}
