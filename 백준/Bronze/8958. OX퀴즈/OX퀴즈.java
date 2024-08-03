import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String input = sc.next();
			char[] arrN = input.toCharArray();
			
			int result = 0;
			int extrapoint = 0;
			for (int j = 0; j < arrN.length; j++) {
				if (arrN[j] =='O'){
					result += extrapoint + 1;
					extrapoint++;
				} else {
					extrapoint = 0;
				}
			}
			System.out.println(result);
		}
	}

}
