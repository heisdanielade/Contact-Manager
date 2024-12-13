package models;

import enums.Gender;
import enums.Relation;

import java.time.LocalDate;

public class Relative extends Person {
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

    public Relative(Relation relationship, boolean livesWithMe, String name, Gender gender, LocalDate dateOfBirth) {
        super(name, gender, dateOfBirth);
    }
}
