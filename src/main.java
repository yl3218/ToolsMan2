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
