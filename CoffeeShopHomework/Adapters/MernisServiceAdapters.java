package JavaKamp.CoffeeShopHomework.Adapters;

import JavaKamp.CoffeeShopHomework.Abstracts.CustomerCheckService;
import JavaKamp.CoffeeShopHomework.Entities.Customer;
import JavaKamp.CoffeeShopHomework.MernisService.NJLKPSPublicSoap;

public class MernisServiceAdapters implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {

        NJLKPSPublicSoap client = new NJLKPSPublicSoap();
        client.TCKimlikNoDogrula(Long.valueOf(customer.getNationality()), customer.getFirstName().toUpperCase(),
                customer.getLastName().toUpperCase(), customer.getDateOfBirth());

        throw new Exception("Geeçersiz giriş");
    }
}
