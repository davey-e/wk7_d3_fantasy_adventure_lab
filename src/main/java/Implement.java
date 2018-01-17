public class Implement<T> {

    private String type;
    private int damagePoints;

    public Implement(String type, int damagePoints) {
        this.type = type;
        this.damagePoints = damagePoints;
    }

    public String getType() {
        return this.type;
    }

    public int getDamagePoints() {
        return damagePoints;
    }
}
