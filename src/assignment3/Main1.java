package assignment3;

public class Main1 {
    public static void main(String[] args) {


        Address addressBilling1 = new Address("Tanti Bazar", "Dhaka", "Dhaka", "123456");
        Address addressShiiping1 = new Address("Tanti Bazar", "Chitagong", "Chitagong", "123456");

        Address addressBilling2 = new Address("Kolkata pal", "Kolkata", "WB", "123456");
        Address addressShiiping2 = new Address("123 Kolkata", "Kolkata", "WB", "123456");

        Address addressBilling3 = new Address("123 fairfield", "Chicago", "Illuna", "123456");
        Address addressShiiping3 = new Address("123 fairfield1sssqweq", "Chicago", "Illuna", "123456");

        Customer customer1 = new Customer("Ranjan", "paul", "123456");
        Customer customer2 = new Customer("Mithun", "paul", "1234567");
        Customer customer3 = new Customer("Babuni", "paul", "123456789");

        customer1.setShippAdd(addressShiiping1);
        customer1.setBillAdd(addressBilling1);

        customer2.setShippAdd(addressShiiping2);
        customer2.setBillAdd(addressBilling2);

        customer3.setShippAdd(addressShiiping3);
        customer3.setBillAdd(addressBilling3);

        Customer[] listCustomers = {customer1, customer2, customer3};
        for(Customer customer: listCustomers) {

            if(customer.getBillAdd().getCity() =="Chicago") {
                System.out.println(customer);

            }
        }


    }
}
