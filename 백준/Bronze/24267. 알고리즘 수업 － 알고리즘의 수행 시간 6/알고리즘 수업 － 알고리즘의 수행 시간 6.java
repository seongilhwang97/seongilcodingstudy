import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long a = 0;
		System.out.println(n*(n-1)*(n-2)/6);
		System.out.println(3);
			
	}

}
/*
 * 1 -> 2 ->3 4 5 6 7
 * 1 -> 3 -> 4 5 6 7
 * 1 -> 4 -> 5 6 7
 * 1 -> 5 -> 6 7 
 * 1 -> 6 -> 7
 * 2 -> 3 -> 4 5 6 7
 * ...
 * 
 *  5 4 3 2 1 
 *  4 3 2 1 
 *  3 2 1 
 *  2 1 
 *  1 
 *  
 *  1 3 6 10 15 
 */

