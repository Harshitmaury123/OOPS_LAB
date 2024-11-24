// FigPackage/Figure.java
package LAB8.FigPackage;

public abstract class Figure {
    protected double r, a, v, pi = 3.1428;

    public Figure(double radius) {
        this.r = radius;
    }

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}
