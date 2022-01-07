package twobeans;

public class Employee {
    private String fullname;
    private Address address;

    public Employee(String fullname, Address address) {
        this.fullname = fullname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", address=" + address +
                '}';
    }
}
