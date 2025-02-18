package models.contact;

import models.contact.enums.Gender;

import java.time.LocalDate;

public class Contact {
    private String first_name;
    private String last_name;
    private String nickname;
    private String email;
    private String phone;
    private Gender gender;
    private LocalDate dateOfBirth;
    private boolean isRelative;


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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        this.gender = gender;
    }

    public boolean isRelative() {
        return isRelative;
    }

    public void setRelative(boolean relative) {
        isRelative = relative;
    }

    // Get person's age from date of birth
    public int getAge() {
        return LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return String.format("Contact: %s %s (%s)\nEmail: %s\nPhone: %s\nGender: %s\nDate of Birth: %s\nRelative: %s",
                first_name, last_name, nickname, email, phone, gender,
                dateOfBirth != null ? dateOfBirth.toString() : "N/A",
                isRelative ? "Yes" : "No");
    }


}
