public class CastMember {
    
    String name;
    int healthPoints;
    
    public CastMember(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String speakName() {
        return "I am " + this.name;
    }
}
