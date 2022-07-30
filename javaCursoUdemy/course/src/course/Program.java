package course;

public class Program {
	public static void main(String[] args) {
		String original = "  abcde FGHIJ KLMNOPQ  ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		
		System.out.println(original);
		System.out.println(s01);
		System.out.println(s02);
		System.out.println('-'+s03+'-');
		System.out.println(s04);
	}
}
