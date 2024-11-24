// FigPackage/Demo.java
package LAB8.FigPackage;

public class Demo {
    public static void main(String[] args) {
        // Create instances of Cone, Sphere, and Cylinder
        cone cone = new cone(5, 7, 10);
        sphere sphere = new sphere(6);
        cylinder cylinder = new cylinder(4, 8);

        // Calculate and display area and volume for Cone
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();

        // Calculate and display area and volume for Sphere
        sphere.calcArea();
        sphere.calcVolume();
        sphere.dispArea();
        sphere.dispVolume();

        // Calculate and display area and volume for Cylinder
        cylinder.calcArea();
        cylinder.calcVolume();
        cylinder.dispArea();
        cylinder.dispVolume();
    }
}
