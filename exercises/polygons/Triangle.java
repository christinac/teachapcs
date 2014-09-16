/**
 * @author:
 * 
 * You may add more private data if it helps (it probably would)
 * You may add more private methods if it helps (again, probably helpful)
 */
public class Triangle implements Polygon
{
    private int x1, x2, x3, y1, y2, y3;
    
    public Triangle(Location loc1, Location loc2, Location loc3) {
        x1 = loc1.row(); y1 = loc1.col();
        x2 = loc2.row(); y2 = loc2.col();
        x3 = loc3.row(); y3 = loc3.col();        
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
    public double perimeter() { return 1.0;
    }
    
    // these methods are specific to Triangles
    public String triangleType() { return "";
    }
    public boolean isTriangle() { return true;
    }
    public boolean isEquilateral() { return true;
    }
    public boolean isIsosceles() {return true;
    }
    public boolean isRight() { return true;
    }
    public boolean isScalene() { return true;
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
