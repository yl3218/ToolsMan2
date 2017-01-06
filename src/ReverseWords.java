public class ReverseWords {

	static String[] iwords;
	static String out = "";

	public static String reverse(String[] words) {
		iwords = words;
		rev(words.length);
		return out.toString();
	}

	public static int rev(int i) {
		if (i == 0)
			return 1;
		else {
			out += iwords[i - 1] + " ";
			return rev(i - 1);
		}
	}

}
