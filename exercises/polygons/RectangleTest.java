

/**
 * The test class RectangleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RectangleTest extends junit.framework.TestCase
{
    /**
     * Default constructor for test class RectangleTest
     */
    public RectangleTest()
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


	public void testTenByFive()
	{
		Rectangle tenByFiveRect = new Rectangle(new Location(0,0), new Location(0,5), new Location(10,5), new Location(10,0));
		assertEquals(50.0,tenByFiveRect.area(),.01);
		assertEquals(11.18,tenByFiveRect.diagonalLength(),.01);
		assertEquals(true,tenByFiveRect.isPolygon());
		assertEquals(true,tenByFiveRect.isRectangle());
		assertEquals(true,tenByFiveRect.isRegular());
		assertEquals(false,tenByFiveRect.isSquare());
		assertEquals(4,tenByFiveRect.numSides());
		assertEquals(30,tenByFiveRect.perimeter(),.01);
		assertEquals("[(0,0) (0,5) (10,5) (10,0)] [Rectangle] [area = 50] [perimeter = 30]",tenByFiveRect.toString());
	}
}


