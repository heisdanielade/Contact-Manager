package models;
public class Family extends Person {
    private String relationship;
    private boolean livesWithMe;

    public String getRelationship() {
        return relationship;
    }

    public boolean isLivesWithMe() {
        return livesWithMe;
    }

    public void setLivesWithMe(boolean livesWithMe) {
        this.livesWithMe = livesWithMe;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Family(String relationship, boolean livesWithMe, String name, int age, String gender) {
        super(name, age, gender);
    }
}
