package linecomparison;
import java.util.Objects;

public class Line {
	Point p1;
	Point p2;
	float length;
	double getLength() {
    return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	}
/*	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Float.compare(line.length, length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }*/
}
