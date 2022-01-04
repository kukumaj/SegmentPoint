import static java.lang.Math.abs;

class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        if (start.getX() == end.getX() && start.getY() == end.getY()) {
        throw new IllegalArgumentException("Start and end cannot be the same");
    }

        this.start = start;
        this.end = end;
    }

    double length() {
          return Math.sqrt(Math.pow((end.getX()-start.getX()),2)+Math.pow((end.getY()-start.getY()),2));
    }

    Point middle() {
        double midX;
        double midY;
        midX = (start.getX()+end.getX())/2;
        midY = (start.getY()+end.getY())/2;
        Point mid = new Point(midX,midY);
        return mid;
    }

    int intersection(Segment another) {
        return 1;
    }

    public static void main(String[] args) {
    }
}
