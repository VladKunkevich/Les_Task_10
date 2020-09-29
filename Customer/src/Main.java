import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerList c1 = new CustomerList();
        Logic log = new Logic();
        Viewer view = new Viewer();

        c1.addCustomer(new Customer());
        c1.addCustomer(new Customer(1, "Petrov Petr Petrovich", "Belarus, Minsk", 1112, 1));
        c1.addCustomer(new Customer(2, "Sidorov Igor Sidorenko", "Belarus, Mogilev", 2232, 2));
        c1.addCustomer(new Customer(3, "Sidorovich Vadim Sidok", "Belarus, Brest", 3433, 3));
        c1.addCustomer(new Customer(4, "Sidorovevich Igor Igorevich", "Belarus, Pinsk", 4454, 4));
        c1.addCustomer(new Customer(5, "Igorenko Igor Vadimovich", "Belarus, Logoisk", 5655, 5));
        c1.addCustomer(new Customer(6, "Default Noname Default", "Belarus, Minsk", 6676, 6));

        List<Customer> cl;
        cl = log.sortedCustomer(c1);
        view.print("Список покупателей в алфавитном порядке: ", cl);

        List<Customer> cl1;
        cl1 = log.intervalCC(c1, 1111, 3333);
        view.print("Список покупателей, у которых номер кредитной карточки находится в заданном интервале: ", cl1);
    }

}
