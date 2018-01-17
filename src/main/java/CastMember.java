public class CastMember {
    
    private String name;
    private int healthPoints;
    
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

    public void takeDamage(int damage) {
        this.healthPoints = this.healthPoints - damage;
        if(this.healthPoints < 0){
            this.healthPoints = 0;
        }
    }
}
