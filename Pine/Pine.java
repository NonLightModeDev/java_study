public class Pine {
	public static void main(String args[]) {
		String c = "*";
		int numberLines = Integer.parseInt(args[0]);

		for(int i = numberLines; i > 0; i--) {
			String s = "";
			for(int j = 0; j < i - 1; j++) {
				s += " ";
			}
			System.out.println(s + c);
			c += "**";
		}
	}
}
