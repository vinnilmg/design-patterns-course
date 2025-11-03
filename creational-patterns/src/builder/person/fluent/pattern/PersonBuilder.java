package builder.person.fluent.pattern;

import builder.person.fluent.model.Person;

public class PersonBuilder {
    // Obrigatorios
    private final String firstName;
    private final String lastName;

    // Opcionais
    private String rg;
    private String cpf;
    private String email;

    public PersonBuilder(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder andRg(final String rg) {
        this.rg = rg;
        return this;
    }

    public PersonBuilder andCpf(final String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PersonBuilder andEmail(final String email) {
        this.email = email;
        return this;
    }

    public Person thenBuild() {
        return new Person(firstName, lastName, rg, cpf, email);
    }
}
