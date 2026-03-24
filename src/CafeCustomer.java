public class CafeCustomer {

    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public CafeCustomer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId +
                ", Name: " + firstName + " " + lastName +
                ", Email: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CafeCustomer)) return false;

        CafeCustomer other = (CafeCustomer) obj;
        return this.customerId == other.customerId ||
                this.email.equals(other.email);
    }
}