package builder.person.complex.pattern.builder;

public class KidBuilder extends PersonBuilder {

    @Override
    public void buildFirstName() {
        person.setFirstName("Kiko");
    }

    @Override
    public void buildLastName() {
        person.setLastName("Enzo");
    }
}
