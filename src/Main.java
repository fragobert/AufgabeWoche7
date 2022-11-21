public class Main {
    public static void main(String[] args) {
        GeographicCoordinate gc = new GeographicCoordinate(-3, -4f);
        GeographicCoordinate gc2 = new GeographicCoordinate(5, 6);

        System.out.println(gc);
        System.out.println(GeographicCoordinate.getDistance(gc, gc2));
    }
}