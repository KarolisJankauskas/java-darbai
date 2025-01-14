import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herdMembers;

    public Herd() {
        herdMembers = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herdMembers.add(movable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable movable : herdMembers) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herdMembers) {
            movable.move(dx, dy);
        }
    }
}
