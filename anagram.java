import java.util.Scanner;

class anagram {

	static boolean check_anagram(String astr,String bstr) {
		int i = 0,j;

		if(astr.length() != bstr.length()) {
			return false;
		}
		
		for(j = 0; j < bstr.length(); j++) {
			if(astr.charAt(i) == bstr.charAt(j)) {
				i++;
				if(i == astr.length()) {
					return true;
				}
				j = -1;
			}		
		}
		return false;
		
	}

	public static void main(String[] args) {
		String astr,bstr;
		boolean result;
		Scanner aStr = new Scanner(System.in);
		Scanner bStr = new Scanner(System.in);

		System.out.println("Enter the first String: ");	
		astr = aStr.nextLine();
			
		System.out.println("Enter the Second String: ");
		bstr = bStr.nextLine();

		result = check_anagram(astr,bstr);
		
		if(result) {
			System.out.println("\n" + result + ", words are Anagrams");
		}
		else {
			System.out.println("\n" + result + ", words are not Anagrams");
		}
	}
}
