public interface Polygon
{
	/**
	  * Determines if the figure is a polygon
	  * @return Returns true if the figure is a polygon,
	  *         false otherwise
	  *
	  * For now, just return true for this method. If you think of a neat way to
	  * determine from a list of points whether those points form a legal polygon (convex),
	  * then let us know. For now, this sounds like too much math - but maybe you
	  * have a good idea.
	  */
	boolean isPolygon();

	/**
	  * Determines if the polygon is Regular
	  * @return Returns true if the figure is a polygon and is Regular,
	  *         false otherwise
	  */
	boolean isRegular();
	
	/**
	  * Returns the number of sides in the polygon
	  * @returns Returns the number of sides in the polygon
	  */
	int numSides();

	/**
	  * Returns the area of the polygon
	  * @returns Returns the area of the polygon
	  * @throws IllegalStateException If the figure is not a polygon
	  */
	double area();

	/**
	  * Returns the perimeter of the polygon
	  * @returns Returns the number of sides in the polygon
	  * @throws IllegalStateException If the figure is not a polygon
	  */
	double perimeter();
}
	