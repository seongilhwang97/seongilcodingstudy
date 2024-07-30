import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();

		int[] count = new int[N];
		count[0] = 1;
		int a = 0;
		boolean destination = true;
		int result = 0;
		out : while (destination) {
			for (int i = 0; i < count.length; i++) {
				if (count[i] == M) {
					destination = false;
					break out;
				}
			}
			if(count[a]%2!=0) {
				//왼쪽
				if(a-L<0) {
					a = count.length + (a-L);
					count[a]++;
				} else {
					a = a-L;
					count[a]++;
				}
			} else {
				//오른
				if(a+L>=count.length) {
					a = a+L - (count.length);
					count[a]++;
				} else {
					a = a+L;
					count[a]++;
				}
			}
			result++;

		}
		System.out.println(result);
	}
}
