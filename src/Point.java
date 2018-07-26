class Point {
    int x;
    int y;

    Point() {
        //this(0, 0);
        this.x = 0;
        this.y = 0;
    }

    Point (String name){

    }

    Point(int x){
        this.x = x;
        this.y = -5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + "," + y + ")");
    }

    //String center(Point other) {
    Point center(Point other) {
        // Returns the center between this point the other point
        // Notice we are using integer, we wan't get an accurate value
        //return new Point(5, 6);
        //return new Point((x + other.x) / 2, (y + other.y) / 2);
        return new Point();
        //return (((x + other.x) / 2 )+ ", " + ((y + other.y) / 2));
    }
}