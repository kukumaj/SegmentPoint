public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2,2);
        Point point2 = new Point(2,2);
        Segment s1 = new Segment(point1,point2);
        System.out.println("midX= "+s1.middle().getX());
        System.out.println("midY "+s1.middle().getY());
        System.out.println("Lenght= "+s1.length());

    }
}
