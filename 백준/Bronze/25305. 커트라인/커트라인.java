import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v = sc.nextInt();
		Integer[] arr = new Integer[n];
		int med = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(arr[v-1]);
	}

}

