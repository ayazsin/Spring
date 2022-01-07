package twobeans;

public class Address {
    private String address;
    private String city;
    private int codePostal;

    public Address(String address, String city, int codePostal) {
        this.address = address;
        this.city = city;
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", codePostal=" + codePostal +
                '}';
    }
}
