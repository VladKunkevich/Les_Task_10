import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerList {

    private List<Customer> customers;

    public CustomerList(){
        customers = new ArrayList<>();
    }

    public CustomerList(Customer[] customers){
        this.customers = new ArrayList<>();
        Collections.addAll(this.customers, customers);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public List<Customer> getCustomersList(){
        return customers;
    }

    public void setCustomers(List<Customer> customers){
        this.customers = customers;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((customers == null) ? 0 : customers.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(o == null)
            return false;
        if(getClass() != o.getClass())
            return false;
        CustomerList other = (CustomerList) o;
        if(customers == null){
            if(other.customers != null)
                return false;
        }else if(!customers.equals(other.customers))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return getClass().getName() + " [customers=" + customers + "]";
    }
}
