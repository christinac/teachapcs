

/**
 * The test class TriangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TriangleTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class TriangleTest
     */
    public TriangleTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

    public void testIsoscelesRight()
    {
        Triangle isosRight = new Triangle(new Location(0,0), new Location(0,3), new Location(3,0));        
        assertEquals(4.5,isosRight.area(),.01);
        assertEquals(false,isosRight.isEquilateral());
        assertEquals(true,isosRight.isIsosceles());
        assertEquals(true,isosRight.isPolygon());
        assertEquals(false,isosRight.isRegular());
        assertEquals(true,isosRight.isRight());
        assertEquals(false,isosRight.isScalene());
        assertEquals(true,isosRight.isTriangle());
        assertEquals(3,isosRight.numSides());
        assertEquals(7.414,isosRight.perimeter(),.01);
        assertEquals("[(0,0) (0,3) (3,0)] [Isosceles Right] [area = 8] [perimeter = 14]",isosRight.toString());
        assertEquals("Isosceles Right",isosRight.triangleType());
    }
}


