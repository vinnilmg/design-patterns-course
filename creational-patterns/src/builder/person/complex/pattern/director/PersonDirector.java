package builder.person.complex.pattern.director;

import builder.person.complex.model.Person;
import builder.person.complex.pattern.builder.PersonBuilder;

public class PersonDirector {
    public PersonBuilder builder;

    public PersonDirector(PersonBuilder builder) {
        this.builder = builder;
    }

    public void constructPerson() {
        builder.buildFirstName();
        builder.buildLastName();
        builder.buildRg();
        builder.buildCpf();
        builder.buildEmail();
    }

    public Person getPerson() {
        return builder.getPerson();
    }
}
