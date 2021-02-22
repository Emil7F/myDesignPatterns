package pl.emil7f.builder;

import java.time.LocalDate;

public class PersonBuilder {
    private String firstName;
    private String middleName;
    private String familyName;
    private String fatherFirstName;
    private String motherFirstName;
    private Integer height;
    private Nationality nationality;
    private EyeColor eyeColor;
    private LocalDate birthday;
    private Boolean isEmployed;
    private Person.Sex sex;
    private Boolean isHomeOwner;
    private Boolean isInsured;
    private Address address;

    public PersonBuilder(String firstName, String familyName, Nationality nationality, LocalDate birthday, Person.Sex sex) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.nationality = nationality;
        this.birthday = birthday;
        this.sex = sex;
    }

    public PersonBuilder middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public PersonBuilder fatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
        return this;
    }

    public PersonBuilder motherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
        return this;
    }

    public PersonBuilder height(Integer height) {
        this.height = height;
        return this;
    }

    public PersonBuilder eyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
        return this;
    }

    public PersonBuilder isEmployed(Boolean isEmployed) {
        this.isEmployed = isEmployed;
        return this;
    }

    public PersonBuilder isHomeOwner(Boolean isHomeOwner) {
        this.isHomeOwner = isHomeOwner;
        return this;
    }

    public PersonBuilder isInsured(Boolean isInsured) {
        this.isInsured = isInsured;
        return this;
    }

    public PersonBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public Person createPerson() {
        return new Person(firstName, firstName, familyName, fatherFirstName, motherFirstName,
                height, nationality, eyeColor, birthday, isEmployed, sex, isHomeOwner, isInsured, address);
    }

}
