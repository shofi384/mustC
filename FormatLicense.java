// Shofi
// shofi384@gmail.com
// Java code to format an unformatted license key in a specified way:
// A '-' after every five character

import java.util.ArrayList;

class FormatLicense {
	public static String formatLicense(String s) {
		ArrayList<Character> result = new ArrayList<Character>();
		int count=0;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != '-') {
				if(count%5==0 && result.size()!=0) {
					result.add('-');
				}
				result.add(s.charAt(i));
				count++;
			}
		}

		StringBuilder r = new StringBuilder(result.size());
		for(char c : result)
			r.append(c);

		return r.toString();
	}

	public static void main(String args[]) {
		System.out.println(formatLicense("aaaaaaaaaaaammmmmmmnnnnnnnnnnnababababab"));
		System.out.println(formatLicense("a-a-a-a-a-a-a-a-ajaa-a-a-aa--aa-a-a-a-a-a"));
		System.out.println(formatLicense(""));
		System.out.println(formatLicense("---------"));
		System.out.println(formatLicense("-"));
		System.out.println(formatLicense("14273a4oiujfnceuweu92626328oiyhdnewe----------"));
	}
}
