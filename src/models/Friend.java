package models;

import enums.Gender;

import java.time.LocalDate;

public class Friend extends Person {

    private String relationshipStrength; // i.e. Close friend, Friend, acquaintance,
    public Friend(String first_name, String last_name, Gender gender, LocalDate dateOfBirth) {
        super(first_name, last_name, gender, dateOfBirth);
    }

}
