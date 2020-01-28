package Inner.Static.Fluent.Builder.Builder.Pattern;

public class Address {
    private final int houseNumber;
    private final String street;
    private final String zipCode;
    private final String city;

    public Address(Builder builder) {
        this.city=builder.city;
        this.houseNumber=builder.houseNumber;
        this.street=builder.street;
        this.zipCode=builder.zipCode;
    }

    public static class Builder {
        private int houseNumber;
        private String street;
        private String zipCode;
        private String city;

        public Builder houseNumber(final int houseNumber) {
            this.houseNumber = houseNumber;
            return this;
        }

        public Builder street(final String street) {
            this.street = street;
            return this;
        }

        public Builder zipCode(final String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder city(final String city) {
            this.city = city;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
