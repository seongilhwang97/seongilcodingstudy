import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int N = input.length();
		int R = 0;
		int C = 0;
		int num = 0;
		out: for (int c = 0; c <= N; c++) {
			for (int r = 0; r <= N; r++) {
				if (r <= c && r * c == N) {
					R = r;
					C = c;
					break out;
				}
			}
		}
//		System.out.println("R=" + R + " C=" + C);
//		System.out.println("1차 받아적기");
		char[][] inputarr = new char[R][C];
		for (int j = 0; j < C; j++) {
			for (int i = 0; i < R; i++) {
				if (num < N) {
					inputarr[i][j] = input.charAt(num);
					num++;
				}
			}
		}
		for (char[] ds : inputarr) {
//			System.out.println(Arrays.toString(ds));
		}
//		System.out.println("다시 합치기");
		int a = 0;
		char[] result2 = new char[N];
		for (int j = 0; j < R; j++) {
			for (int i = 0; i < C; i++) {
				result2[a] = inputarr[j][i];
				a++;
			}
		}
		for (char d : result2) {
			System.out.print(d);
		}
//		// 원래는 R=2,C=3이었는데 3,2로 만들고 옮겨
//		int b = 0;
//		char[][] resultarr = new char[C][R];
//		for (int i = 0; i < C; i++) {
//			for (int j = 0; j < R; j++) {
//				resultarr[i][j] = result2[b];
//				b++;
//			}
//		}
//		for (char[] ds : resultarr) {
//			System.out.println(Arrays.toString(ds));
//		}
//		for (int c = 0; c < C; c++) {
//			for (int r = 0; r < R; r++) {
//				System.out.print(inputarr[r][c]);
//			}
//		}

	}

}
/*
 * koaski koa ski
 * 
 * ksokai
 * 
 * 
 * 
 * 
 * ko as ki
 */
