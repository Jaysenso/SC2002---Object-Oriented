public class Triangle extends Polygon{

    public Triangle(String theName, float theWidth, float theHeight){
        super(theName, theWidth, theHeight);
        this.polytype = KindofPolygon.POLY_TRIANG;
    }

    public float calArea(){
        float area =  (this.width * this.height) / 2;
        return area;
    }
}


