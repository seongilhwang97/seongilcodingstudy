import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[101][101];
		int result = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int r = y; r < y + 10; r++) {
				for (int c = x; c < x + 10; c++) {
					map[r][c] = 1;
				}
			}
		}
		for (int r = 0; r < map.length; r++) {
			for (int c = 0; c < map.length; c++) {
				if (map[r][c] == 1) {
					int count = 0;
					// 0의 갯수 카운트를 어떻게 하
					if ((map[r + 1][c] == 0)) {
						count++;
					}
					if (map[r - 1][c] == 0) {
						count++;
					}
					if (map[r][c - 1] == 0) {
						count++;
					}
					if (map[r][c + 1] == 0) {
						count++;
					}
					result += count;
				}
//				if (map[r][c] == 1 && ((map[r + 1][c] == 0) || (map[r - 1][c] == 0) || (map[r][c - 1] == 0)
//						|| (map[r][c + 1] == 0))) {
//					result += map[r][c];
//				}
			}
		}
		System.out.println(result);
		result = 0;
	}
}
