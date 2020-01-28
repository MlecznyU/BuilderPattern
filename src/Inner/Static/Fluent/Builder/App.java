package Inner.Static.Fluent.Builder;

import Inner.Static.Fluent.Builder.Default.Account;
import Inner.Static.Fluent.Builder.Builder.Pattern.*;

public class App {
    public static void main(String[] args) {
        Account account1 = new Account(1, "Tomasz.Michlewski@gmail.com","Tomasz","Michlewski",99,"StreetName","code","Lodz");


        Name name = new Name.Builder().firstName("Tomasz")
                          .surname("Michlewski")
                          .build();
        Address address = new Address.Builder().city("Lodz")
                             .houseNumber(111)
                             .street("Some Street")
                             .zipCode("123")
                             .build();
        Inner.Static.Fluent.Builder.Builder.Pattern.Account account = new Inner.Static.Fluent.Builder.Builder.Pattern.Account.Builder().address(address)
                                                                               .name(name)
                                                                               .email("Tomasz.michlewski@gmail.com")
                                                                               .id(1)
                                                                               .build();

        System.out.println(account1);
        System.out.println(account);
    }
}
