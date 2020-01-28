package Inner.Static.Fluent.Builder.Default;

public class Account {
    private int id;
    private String email;
    private String firstName;
    private String surname;
    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;

    public Account(int id, String email, String firstName, String surname, int houseNumber, String street, String zipCode, String city) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.surname = surname;
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
