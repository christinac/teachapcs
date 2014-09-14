class ScrambleOrRemove{

	/* Scrambles each word in the list and return
	 * another list of only those that are unchanged
	 * @ param 	wordList – the list of words to be scrambled
	 *     or removed
	 */
	ArrayList<String> scrambleOrRemove(ArrayList<String> wordList){
		// Start scrambling!
	}

	/* Returns a scrambled version of the word it's passed
	 * @ param 	word – the word to be scrambled
	 */
	String scrambleWord(String word){
		int current = 0;
		String result = "";

		while(current < word.length() - 1){
			if(word.substring(current, current + 1).equals("A") && !word.substring(current + 1, current + 2).equals("A")){
				result += word.substring(current +1, current + 2);
				result += "A";
				current += 2;
			}else{
				result += word.substring(current, current + 1);
				current++;
			}
		}

		if(current < word.length()){
			result += word.substring(current);
		}

		return result;
	}
}