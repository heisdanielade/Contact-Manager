package models;

import enums.Gender;
import enums.Relation;

import java.time.LocalDate;

public class Relative extends Contact {
    private Relation relationship; // i.e.Parent, Sibling, inlaw, chils
    private boolean livesWithMe;

    public Relation getRelationship() {
        return relationship;
    }

    public boolean isLivesWithMe() {
        return livesWithMe;
    }

    public void setLivesWithMe(boolean livesWithMe) {
        this.livesWithMe = livesWithMe;
    }

    public void setRelationship(Relation relationship) {
        this.relationship = relationship;
    }

    public Relative(Relation relationship, boolean livesWithMe, String first_name, String last_name, Gender gender, LocalDate dateOfBirth) {
        super(first_name, last_name, gender, dateOfBirth);
    }
}
