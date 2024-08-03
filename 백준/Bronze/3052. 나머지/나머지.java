import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrN = new int[10];
		for (int i = 0; i < 10; i++) {
			arrN[i] = sc.nextInt();
		}
		int[] resultN = new int[10];
		for (int i = 0; i < 10; i++) {
			resultN[i] = arrN[i]%42;
		}
		Set<Integer> arrset = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			arrset.add(arrN[i]%42);
		}
		System.out.println(arrset.size());
		
//		System.out.println(Arrays.toString(arrN));
//		System.out.println(Arrays.toString(resultN));
	}

}
