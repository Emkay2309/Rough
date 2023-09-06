package OOPS;

public class Point {
    int x,y;

    //constructor
    Point(int xval , int yval) {
        x = xval;
        y = yval;
    }
    public int hashCode() {
        return (x+y)%10;
    }

    public boolean equals (Object obj) {
        Point o = (Point)obj;

        if(x==o.x && y == o.y) {
            return true;
        }
        else {
            return false;
        }
    }
}
