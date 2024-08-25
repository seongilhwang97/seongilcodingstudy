
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] map = new char[N][];
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
		}
		int min = Integer.MAX_VALUE;
		char[][] cmap = {
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'},
				{'B','W','B','W','B','W','B','W'},
				{'W','B','W','B','W','B','W','B'}};
		// 전체 순회
		for (int r = 0; r <= N-8; r++) {
			for (int c = 0; c <= M-8; c++) {
				int counta = 0;
				int countb = 0;
				int num = -1;
				int num2 = 0;
				// 8칸 순회(Black일때)
				for (int r1 = r; r1 < r+8; r1++) {
					num2=0;
					num++;
					for (int c1 = c; c1 < c+8; c1++) {
						if(map[r1][c1]==cmap[num][num2]) {
							countb++;
						} else {
							counta++;
						}
						num2++;
					}
				}
				if(min>Math.min(counta, countb)) {
					min = Math.min(counta, countb);
				}
				
			}
			
		}
		System.out.println(min);
		
		
	}

}
