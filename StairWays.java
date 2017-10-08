
/**
 * @author shofi
 *
 */

import java.util.Scanner;

public class stairWays {

	/**
	 * @param args
	 */
	static int getWays(int n) {
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		if(n==3)
			return 4;
		return getWays(n-1)*getWays(n-2)*getWays(n-3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of stairs."
				+ "\nI will give the number of ways that can be climbed taking 1, 2 or 3 steps at a time: ");
		System.out.println("These stairs can be climbed in '" + stairWays.getWays(in.nextInt()) + "' ways!");
		in.close();
	}

}
