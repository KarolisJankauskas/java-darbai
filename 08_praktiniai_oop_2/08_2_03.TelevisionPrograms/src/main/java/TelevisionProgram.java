
public class TelevisionProgram {

    private final String name;
    private final int duration;

    public TelevisionProgram(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() {
        return this.name.contains("MasterChef");
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.duration + " minutes";
    }
}
