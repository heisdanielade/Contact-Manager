package models;

import enums.Gender;

import java.time.LocalDate;

public class Friend extends Person {

    private String relationshipStrength; // i.e. Close friend, Friend, acquaintance,
    public Friend(String name, Gender gender, LocalDate dateOfBirth) {
        super(name, gender, dateOfBirth);
    }

}
