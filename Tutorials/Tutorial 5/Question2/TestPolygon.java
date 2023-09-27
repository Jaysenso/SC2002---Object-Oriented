public class TestPolygon{
    
    public static void main(String[] args){

    //    Rectangle rect = new Rectangle("Rectangle", 2, 5);
    //    Triangle tri = new Triangle("Triangle", 2,5);
    //    TestPolygon test = new TestPolygon();
    //    test.printArea(rect);
    //    test.printArea(tri);

        Polygon rect = new Rectangle("Rectangle", 2, 5);
        Polygon tri = new Triangle("Rectangle", 2, 5);
        TestPolygon test = new TestPolygon();
        test.printArea(rect);
        test.printArea(tri);
    }

    public double printArea(Polygon polygon){
        System.out.println("The area is :" + polygon.calArea());
        return 0;
    }



    //dynamic binding
    // public double printArea(Polygon polygon){

    //     double area = 0;
    //     if(polygon instanceof Rectangle){
    //         area = polygon.width * polygon.height;
    //         System.out.println(area);
    //     }

    //     else if(polygon instanceof Triangle){
    //         area = 0.5 * polygon.width * polygon.height;
    //         System.out.println(area);
    //     }
    //     return area;
    // }

    //static binding
    public double printArea(Rectangle r){
        System.out.println("Area of Rectangle is " + (r.height * r.width));
        return r.height * r.width;
    }

    public double printArea(Triangle t){
        System.out.println("Area of Triangle is " +  (0.5 * t.height * t.width));
        return 0.5 * t.height * t.width;
    }

}
