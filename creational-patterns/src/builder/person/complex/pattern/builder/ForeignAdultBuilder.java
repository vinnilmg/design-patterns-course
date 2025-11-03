package builder.person.complex.pattern.builder;

public class ForeignAdultBuilder extends PersonBuilder {

    @Override
    public void buildFirstName() {
        person.setFirstName("Chivas");
    }

    @Override
    public void buildLastName() {
        person.setLastName("Son");
    }

    @Override
    public void buildEmail() {
        person.setEmail("KbA9M@example.com");
    }
}
