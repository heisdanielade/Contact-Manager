package models;

import enums.Gender;

import java.time.LocalDate;

public class Contact {
    private int id;
    private String first_name;
    private String last_name;
    private Gender gender;
    private LocalDate dateOfBirth;

    public Contact(String first_name, String last_name, Gender gender, LocalDate dateOfBirth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        String formattedGender = gender.toString().toLowerCase();
        this.gender = gender;
    }

    // Get person's age from date of birth
    public int getAge() {
        return LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public String toString() {
        return String.format("%s %s (%d years) - %s", this.getFirst_name(), this.getLast_name(), this.getAge(), this.getGender());
    }

}
