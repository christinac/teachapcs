import aces.jukebox.Song

class JukeboxController implements Iterator{
	private ArrayList playlist;
	private int currentIndex;

	/**
	 * Creates an empty JukeboxController object
 	 */
	public JukeboxController(){
		playlist = new ArrayList();
		currentIndex = 0;
	}

	/**
	 * Plays the songs on the playlist in order. When all the songs have been played, the Jukebox turns off.
 	 */
	public void play(){
		while(hasNext()){
			Song nextSong = (Song) next();
			System.out.println(nextSong);
		}
		turnOff();
	}

	/**
	 * Adds a Song to the playlist
 	 */
	public void addSong(Song song){
		playlist.add(song);
	}

	/**
	 * Determines whether the JukeboxController' playlist has a "next" song or if they've all been played
	 * @return true if there's a next song; false otherwise
 	 */
	public boolean hasNext(){
		return currentIndex < playlist.size();
	}

	/**
	 * Returns the next song in the JukeboxController's playlist
	 * @return the next Song on the playlist, typed as an Object
 	 */
	public Object next(){
		Song nextSong = (Song) playlist.get(currentIndex);
		currentIndex++;
		return nextSong;
	}

	/**
	 * Skips the currently-playing song and plays the next song on the playlist if one exists
	 * If there's not a next song, it turns off the Jukebox
 	 */
	public void skip(){
		if (hasNext()){
			next();
		}else{
			turnOff();
		}
	}

	/**
	 * Prints a hello message to the console and plays the first song
	 * If the playlist is empty, it adds two songs to get started.
 	 */
	public void turnOn(){
		System.out.println("Welcome to the Jukebox!");

		if (playList.size() == 0){
			Song beyonce = new Song("XO", "Beyonce", "I love you like XO\nYou love me like XO");
			addSong(beyonce);
			Song taylor = new Song("Red", "Taylor Swift", "Losing him was blue like I'd never known\nMissing him was dark grey all alone");
			addSong(taylor);
		}
	}

	/**
	 * Prints a goodbye message to the console
 	 */
	public void turnOff(){
		System.out.println("That's all I've got! Have a good night!");
	}
}