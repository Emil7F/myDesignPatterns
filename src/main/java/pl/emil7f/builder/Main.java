package pl.emil7f.builder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder("FirstName", "FamilyName", Nationality.PL,
                LocalDate.of(1990, 10, 11), Person.Sex.MALE);

        Person person = personBuilder
                .middleName("MiddleName")
                .fatherFirstName("FathersName")
                .motherFirstName("MothersName")
                .height(180)
                .eyeColor(EyeColor.GREEN)
                .isEmployed(true)
                .isHomeOwner(false)
                .isInsured(true)
                .address(new Address("Gliwicka", 130, 8))
                .createPerson();

        System.out.println(person.toString());


    }
}
