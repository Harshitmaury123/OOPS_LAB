// FigPackage/Cylinder.java
package LAB8.FigPackage;

public class cylinder extends Figure {
    private double h;

    public cylinder(double radius, double height) {
        super(radius);
        this.h = height;
    }

    @Override
    public void calcArea() {
        a = (2 * pi * r * r) + (2 * pi * r * h);
    }

    @Override
    public void calcVolume() {
        v = pi * r * r * h;
    }

    @Override
    public void dispArea() {
        System.out.println("Cylinder Area: " + a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Cylinder Volume: " + v);
    }
}
