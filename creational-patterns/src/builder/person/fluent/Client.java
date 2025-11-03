package builder.person.fluent;

import builder.person.fluent.pattern.PersonBuilder;

public class Client {

    public static void main(String[] args) {
        final var kid = new PersonBuilder("Kiko", "Enzo")
                .thenBuild();

        System.out.println(kid);

        final var adult = new PersonBuilder("John", "Doe")
                .andRg("123456789")
                .andCpf("123.456.789-00")
                .andEmail("d1X3o@example.com")
                .thenBuild();

        System.out.println(adult);

        final var foreignAdult = new PersonBuilder("Chivas", "Son")
                .andEmail("KbA9M@example.com")
                .thenBuild();

        System.out.println(foreignAdult);
    }
}
