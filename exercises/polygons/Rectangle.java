/** 
 * @author: 
 * 
 * You may add more private data if it helps (it probably would)
 * You may add more private methods if it helps (again, probably helpful)
 */
public class Rectangle implements Polygon
{
    private int x1, x2, x3, x4, y1, y2, y3, y4;

    public Rectangle(Location loc1, Location loc2, Location loc3, Location loc4) {
        x1 = loc1.row(); y1 = loc1.col();
        x2 = loc2.row(); y2 = loc2.col();
        x3 = loc3.row(); y3 = loc3.col();  
        x4 = loc4.row(); y4 = loc4.col();  
    }
    
    // these 5 methods must be implemented as part of the Polygon interface
    public boolean isPolygon() { return true;
    }
    public boolean isRegular() { return true;
    }
    public int numSides() { return 1;
    }
    public double area() { return 1.0;
    }
    public double perimeter() { return 1;
    }
    
    // these methods are specific to Rectangles
    public boolean isRectangle() { return true;
    }
    public boolean isSquare() { return true;
    }
    public double diagonalLength() { return 1.0;
    }
    public String toString() { return "";
    }
    
    //don't edit this method
    private boolean areDoublesEqual(double x, double y) {
        Double xObj = new Double(x);
        Double yObj = new Double(y);
        return xObj.equals(yObj);
    }
}
