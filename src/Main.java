public class Main {
    public static void main(String[] args) {
        GeographicCoordinate min = new GeographicCoordinate(100,100);
        GeographicCoordinate max = new GeographicCoordinate(0,0);

        for(int i = 0; i < 100; i++){
            GeographicCoordinate gc = new GeographicCoordinate((float) (Math.random()*100), (float) (Math.random()*100));
            if(gc.getDistanceTo0() > max.getDistanceTo0()){
                max = gc;
            }
            if(gc.getDistanceTo0() < min.getDistanceTo0()){
                min = gc;
            }
            System.out.println(gc);
        }
        System.out.println("Max: \n" + max);
        System.out.println("Min: \n" + min);
        GeographicCoordinate gc1 = new GeographicCoordinate(1,1);
        GeographicCoordinate gc2 = new GeographicCoordinate(2,2);
        System.out.println("Add: \n" + GeographicCoordinate.add(gc1,gc2));
    }
}