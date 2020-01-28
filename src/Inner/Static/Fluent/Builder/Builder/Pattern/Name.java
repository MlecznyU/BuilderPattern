package Inner.Static.Fluent.Builder.Builder.Pattern;

public class Name {
    private final String firstName;
    private final String surname;

    public Name(Builder builder){
        this.firstName=builder.firstName;
        this.surname=builder.surname;
    }

    public static class Builder {
        private String firstName;
        private String surname;

        public Builder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder surname(final String surname) {
            this.surname = surname;
            return this;
        }
        public Name build(){
            return new Name(this);
        }

    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
