public class Bank_customer {
    String custName;
    String custAddress;
    int custId;

    public Bank_customer(String name, int id, String address) {
        custName = name;
        custId = id;
        custAddress = address;
    }

    public void display() {
        System.out.println("Customer Details:");
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + custId);
        System.out.println("Customer Address: " + custAddress);
        System.out.println();
    }