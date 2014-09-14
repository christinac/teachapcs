/**
 * A Song is an object that has a title, chorus, and artist. 
 * @ author Aces
 * @ version 0.1
 */
class Song{
	private String myTitle;
	private String myArtist;
	private String myChorus;

	/**
	 * Creates a Song with a title, chorus, and artist
 	 */
	public Song(String title, String artist, String chorus){
		myTitle = title;
		myArtist = artist;
		myChorus = chorus;
	}

	/**
	 * @return the title of the Song
 	 */
	public String getTitle(){
		return myTitle;
	}

	/**
	 * @return the artist of the Song
 	 */
	public String getArtist(){
		return myArtist;
	}

	/**
	 * @return the chorus of the Song
 	 */
	public String getChorus(){
		return myChorus;
	}

	/**
 	 * The song displayed as a String. Useful for debugging.
	 * @return the String representation of the Song
 	 */
	public String toString(){
		return "Now playing " + myTitle + " by " + myArtist + ": " + myChorus + " ... ";
	}
}