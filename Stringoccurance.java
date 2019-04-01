
public class Stringoccurance {

	public static void main(String[] args) {
		String s = "Hi this is java class";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a') {
				count++;

			}

		}
		System.out.println(count);
	}

}
