public class Friend {
    private String id;
    private String fullName;
    private int age;
    private String gender;

    public String getId() {
        return id;
    }

    public void setId(String name) {
        // the friend id is defined: # plus the reversed form of the friend name + a random 4-digit number

        if (name == null || name.isEmpty()) {
            String originalName = this.getFullName();
            StringBuilder reversedName = new StringBuilder();
            int randomNumber = 1000 +  (int)(Math.random() * 8999);
            for (int i = 0; i<originalName.length(); i++){
                reversedName.insert(0, originalName.charAt(i));
                // or reversedName = originalName.charAt(i) + reversedName;
            }
            this.id =  "#" + reversedName + randomNumber;
        } else {
            this.id = "Unknown";
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Friend(String name, int age, String gender) {
        this.fullName = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return String.format("[%s] %s (%d years) - %s", this.getId(), this.getFullName(), this.getAge(), this.getGender());
    }

}
