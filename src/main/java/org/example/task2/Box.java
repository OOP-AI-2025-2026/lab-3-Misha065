package org.example.task2;

public class Box {
    private double length;
    private double height;
    private double width;

    public Box(double length, double height, double width) {
        this.length = validate(length, "Довжина");
        this.height = validate(height, "Висота");
        this.width = validate(width, "Ширина");
    }

    private double validate(double value, String name) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " повинна бути додатнім числом.");
        }
        return value;
    }

    public double getVolume() {
        return length * height * width;
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }
}
