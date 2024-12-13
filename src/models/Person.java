package models;
import enums.Gender;
import java.time.LocalDate;

public class Person {
    private int id;
    private String fullName;
    private Gender gender;
    private LocalDate dateOfBirth;

    public Person(String name, Gender gender, LocalDate dateOfBirth) {
        this.fullName = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        try {
            id = (int) (1000 + (Math.random() * 8999));
        } catch (Exception e) {
            System.out.printf("\n(e) %s", e.getMessage());
        }
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        return String.format("%s (%d years) - %s", this.getFullName(), this.getAge(), this.getGender());
    }

}
