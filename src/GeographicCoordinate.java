public class GeographicCoordinate {
    private double x, y, r, phi;

    //constructor
    public GeographicCoordinate(float x, float y) {
        this.x = Math.round(x*100)/100d;
        this.y = Math.round(y*100)/100d;
        this.r = Math.round(Math.sqrt(x * x + y * y)*100)/100d;
        this.phi = Math.round(Math.atan(y / x)*100)/100d;

    }

    public GeographicCoordinate(double r, double phi) {
        this.r = r;
        this.phi = phi;
        this.x = r * Math.cos(phi);
        this.y = r * Math.sin(phi);
    }

    public double getX() {
        return this.x = Math.round(x * 100d) / 100d;
    }

    public double getY() {
        return this.y= Math.round(y * 100d) / 100d;
    }

    public double getR() {
        return this.r= Math.round(r * 100d) / 100d;
    }

    public double getPhi() {
        return this.phi = Math.round(phi * 100d) / 100d;
    }


    @Override
    public String toString() {
        return "Karthesisch: (" + this.getX() + ", " + this.getY() + ")\n" +
                "Polar: (" + this.getR() + ", " + this.getPhi()+"°)";
    }
    public static double getDistance(GeographicCoordinate gc1, GeographicCoordinate gc2){
        return Math.sqrt(Math.pow(gc1.getX()-gc2.getX(),2)+Math.pow(gc1.getY()-gc2.getY(),2));
    }
}
