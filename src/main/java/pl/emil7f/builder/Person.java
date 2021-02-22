package pl.emil7f.builder;

import java.time.LocalDate;

public class Person {

     public enum Sex {
         MALE, FEMALE
     }



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
    private Sex sex;
    private Boolean isHomeOwner;
    private Boolean isInsured;
    private Address address;

    public Person(String firstName, String middleName, String familyName, String fatherFirstName, String motherFirstName, Integer height, Nationality nationality, EyeColor eyeColor, LocalDate birthday, Boolean isEmployed, Sex sex, Boolean isHomeOwner, Boolean isInsured, Address address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.fatherFirstName = fatherFirstName;
        this.motherFirstName = motherFirstName;
        this.height = height;
        this.nationality = nationality;
        this.eyeColor = eyeColor;
        this.birthday = birthday;
        this.isEmployed = isEmployed;
        this.sex = sex;
        this.isHomeOwner = isHomeOwner;
        this.isInsured = isInsured;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public void setFatherFirstName(String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public void setMotherFirstName(String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public EyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(EyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Boolean getHomeOwner() {
        return isHomeOwner;
    }

    public void setHomeOwner(Boolean homeOwner) {
        isHomeOwner = homeOwner;
    }

    public Boolean getInsured() {
        return isInsured;
    }

    public void setInsured(Boolean insured) {
        isInsured = insured;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", nationality=" + nationality +
                ", birthday=" + birthday +
                ", sex=" + sex +
                '}';
    }
}
