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

    Point intersection(Segment  another) {
        double x1 = this.start.getX();
        double x2 = this.end.getX();
        double x3 = another.start.getX();
        double x4 = another.end.getX();
        double y1 = this.start.getY();
        double y2 = this.end.getY();
        double y3 = another.start.getY();
        double y4 = another.end.getY();
        double d =(x1-x2)*(y3-y4)-(y1-y2)*(x3-x4);
        double px =((x1*y2-y1*x2)*(x3-x4)-(x1-x2)*((x3*y4)-(y3*x4)))/d;
        double py =((x1*y2-y1*x2)*(y3-y4)-(y1-y2)*((x3*y4)-(y3*x4)))/d;
        return   new Point(px,py);



    }
    ////        double x1;
////        double x2;
////        double x3;
////        double x4;
////        double y1;
////        double y2;
////        double y3;
////        double y4;
//        Point p1 = new Point(x1, y1);
//        Point p2 = new Point(x2, y2);
//        Point p3 = new Point(x3, y3);
//        Point p4 = new Point(x4, y4);

    //-(p1.getX() - p2.getX())*(p3.getX() * p4.getY()-p3.getY() * p4.getX()));
    // /((p1.getX() - p2.getX())*(p3.getY() - p4.getY())-(p1.getY() - p2.getY())*(p3.getX() - p4.getX()));

}
