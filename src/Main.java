public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0,0);
        Point point2 = new Point(4,0);
        Point point3 = new Point(2,1);
        Point point4 = new Point(1,2);
        
        Segment s1 = new Segment(point1,point2);
        Segment s2 = new Segment(point3,point4);
        System.out.println("midX= "+s1.middle().getX());
        System.out.println("midY "+s1.middle().getY());
        System.out.println("Lenght= "+s1.length());
        Point intersection = s1.intersection(s2);
       Point inter =s1.intersection(s2);
        System.out.println(inter.toString());


    }
}
