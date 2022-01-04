import javax.lang.model.type.IntersectionType;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0,0);
        Point point2 = new Point(2,2);
        Point point3 = new Point(0,2);
        Point point4 = new Point(2,0);

        Segment s1 = new Segment(point1,point2);
        Segment s2 = new Segment(point3,point4);
        System.out.println("midX= "+s1.middle().getX());
        System.out.println("midY "+s1.middle().getY());
        System.out.println("Lenght= "+s1.length());

       double inter =s1.intersection(s1,s2);
        System.out.println(inter);


    }
}
