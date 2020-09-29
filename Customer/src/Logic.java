import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Logic {
    List<Customer> sortedCustomer(CustomerList list){
        List<Customer> customers = list.getCustomersList();
        customers.sort(Comparator.comparing(Customer::getFullName));
        return customers;
    }

    public List<Customer> intervalCC(CustomerList list, int min, int max){
        List<Customer> result = new ArrayList<>();

        List<Customer> customers = list .getCustomersList();

        for (Customer customer : customers) {
            if ((customer.getCardNumber() < min) && (customer.getCardNumber() > max)) {
                continue;
            }
            result.add(customer);
        }
        return result;
    }
}


