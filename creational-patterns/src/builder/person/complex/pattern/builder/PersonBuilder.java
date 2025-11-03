package builder.person.complex.pattern.builder;

import builder.person.complex.model.Person;

public abstract class PersonBuilder {
    protected Person person;

    protected PersonBuilder() {
        this.person = new Person();
    }

    public Person getPerson() {
        return person;
    }

    public void buildFirstName() {
    }

    public void buildLastName() {
    }

    public void buildRg() {
    }

    public void buildCpf() {
    }

    public void buildEmail() {
    }
}
