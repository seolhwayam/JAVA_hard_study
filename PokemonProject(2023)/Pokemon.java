import java.util.List;
import java.util.List;

public abstract class Pokemon {
    private String name;
    private int power;
    private int speed;

    List<String> skills;

    abstract public void attack();

    public Pokemon(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    public Pokemon() {
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}