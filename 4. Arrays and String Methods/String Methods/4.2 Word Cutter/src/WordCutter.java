public class WordCutter
{
    //code the method cutInHalf that returns the first half of the String passed as argument
    /* Code the cutInHalf method that returns the first half of the word input. */
	public static String cutInHalf(String tocut) {
		int halflength;

		halflength = (tocut.length()) / 2;
		return tocut.substring(0, halflength);
	}
}