public class GetShortestWord {
	//code the method getShortestWord that accepts two words and returns the shortest one
	/* Code a method that returns the shortest word of the two inputs*/
	public static String getShortestWord(String word1, String word2) {

		int length1 = word1.length();
		int length2 = word2.length();
		if (length1 < length2) {
			return word1;
		} else {
			return word2;
		}
	}
}