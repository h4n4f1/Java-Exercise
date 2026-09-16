package OOP;

class Point {
    int x;
    int y;

    Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point (Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void display() {
        System.out.println("(" + this.x + ", " + this.y + ")");
    }
}

public class PointDuplicator {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4); 
        Point p2 = new Point(p1);
        System.out.print("p2 = ");
        p2.display();
    }
}
