import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] words = str.split(" ");

		System.out.println(ReverseWords.reverse(words));
	}
}

class ReverseWords {

	static String[] iwords;
	static String out = "";

	public static String reverse(String[] words) {
		iwords = words;
		rev(words.length);
		return out.toString();
	}

	public static int rev(int i) {
		if (i != iwords.length && i != 0)
			out += " ";
		if (i == 0) {
			return 1;
		} else {
			out += iwords[i - 1];
			return rev(i - 1);
		}
	}

}
