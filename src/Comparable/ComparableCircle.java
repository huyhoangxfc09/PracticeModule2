package Comparable;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle(String color, double radius) {
        super(color, radius);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle() {
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }

}
