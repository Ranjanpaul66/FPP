package assignment3;

public class Customer {
    String firstName, lastName,socSecurityNum;
    Address shippingAddress, billingAddress;

    public Customer(String firstName, String lastName, String socSecurityNum ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum= socSecurityNum;

    }

    public String getFName() {

        return firstName;

    }

    public String getLName() {

        return lastName;

    }

    public String getSNum() {

        return socSecurityNum;
    }

    public Address getShippAdd() {

        return shippingAddress;

    }
    public void setShippAdd(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


    public Address getBillAdd() {

        return billingAddress;

    }


    public void setBillAdd(Address billAddress) {
        this.billingAddress = billAddress;
    }


    @Override
    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }



}

