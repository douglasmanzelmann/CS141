
public class CountLettersInArray {
	public static void main(String[] args) {
		char[] chars = createArray();
		
		System.out.println("The lower case letters are: "); 
		displayArray(chars);
		
		int[] counts = countLetters(chars);
		
		System.out.println("\nThe occurences of each letter are: ");
		displayCounts(counts);
		
	}
	
	public static char[] createArray() {
		char[] chars = new char[100];
		
		for (int i = 0; i < chars.length; i++) {
			chars[i] = RandomCharacter.getRandomLowCaseLetter();
		}
		
		return chars;
	}
	
	public static void displayArray(char[] chars) {
		for(char letter: chars) {
			System.out.print(letter + " ");
		}
	}
	
	public static int[] countLetters(char[] chars) {
		int[] counts = new int[26];
		
		for (int i = 0; i < chars.length; i++) {
			counts[chars[i] - 'a']++;
		}
		
		return counts;
	}
	
	public static void displayCounts(int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.println((char)(i + 'a') + ": " + counts[i] );
		}
	}
	
}
