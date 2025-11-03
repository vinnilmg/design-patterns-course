package builder.person.complex;

import builder.person.complex.pattern.builder.AdultBuilder;
import builder.person.complex.pattern.builder.ForeignAdultBuilder;
import builder.person.complex.pattern.builder.KidBuilder;
import builder.person.complex.pattern.builder.PersonBuilder;
import builder.person.complex.pattern.director.PersonDirector;

public class Client {
    public static void constructPerson(final PersonBuilder builder) {
        final var director = new PersonDirector(builder);
        director.constructPerson();

        System.out.println(director.getPerson());

        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        constructPerson(new KidBuilder());
        constructPerson(new AdultBuilder());
        constructPerson(new ForeignAdultBuilder());
    }
}
