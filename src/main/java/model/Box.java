package model;

import java.util.Objects;

public class Box {

    private double width;
    private double length;
    private Advocate advocate;

    public Box(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(box.width, width) == 0 && Double.compare(box.length, length) == 0 && Objects.equals(advocate, box.advocate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, advocate);
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
