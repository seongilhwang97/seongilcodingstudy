import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		check = new boolean[N];
		result = new int[M];
		dfs(0);
		
	}
	static int N;
	static int M;
	static boolean[] check;
	static int[] result;
	static void dfs(int sidx) {
		if(sidx==M) {
			for (int i = 0; i <M; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < check.length; i++) {
			if(check[i]) {
				continue;
			}
			check[i] = true;
			result[sidx] = i+1;
			dfs(sidx+1);
			check[i] = false;
//			dfs(idx+1,sidx);
		}
		
	}

}
