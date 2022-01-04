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
        return Math.sqrt(Math.pow((end.getX() - start.getX()), 2) + Math.pow((end.getY() - start.getY()), 2));
    }

    Point middle() {
        double midX;
        double midY;
        midX = (start.getX() + end.getX()) / 2;
        midY = (start.getY() + end.getY()) / 2;
        return new Point(midX, midY);
    }

    double intersection(Segment s1, Segment s2) {
        double x1 = 0;
        double x2 = 0;
        double x3 = 0;
        double x4 = 0;
        double y1 = 0;
        double y2 = 0;
        double y3 = 0;
        double y4 = 0;
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);
        return p1.getX() * p2.getY() * p3.getX() * p4.getY();

    }


}
