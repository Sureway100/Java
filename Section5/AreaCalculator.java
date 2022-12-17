public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(5.0, 4.0));

    }

    public static double area(double r) {
//double value for area of a circle;
        return (r < 0) ? -1 : (r * r) * Math.PI;
    }

    public static double area(double x, double y) {
//The method needs to return an area of a rectangle.;
        return (x < 0 || y < 0) ? -1 : x * y;

    }
}
