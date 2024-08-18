import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[10];
		for (int t = 1; t < T+1; t++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			float count = 0;
			for (int i = 1; i < arr.length-1; i++) {
				count+=arr[i];
			}
			System.out.printf("#%d %.0f\n",t,count/8);
		}
	}

}
