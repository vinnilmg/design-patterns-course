package builder.person.complex.pattern.builder;

public class AdultBuilder extends PersonBuilder {

    @Override
    public void buildFirstName() {
        person.setFirstName("John");
    }

    @Override
    public void buildLastName() {
        person.setLastName("Doe");
    }

    @Override
    public void buildRg() {
        person.setRg("123456789");
    }

    @Override
    public void buildCpf() {
        person.setCpf("123.456.789-00");
    }

    @Override
    public void buildEmail() {
        person.setEmail("d1X3o@example.com");
    }
}
