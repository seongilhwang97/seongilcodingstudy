import java.util.Scanner;

public class Main {
    static int N;
    static int[][] map;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        movePipe(0, 1, 0); // 초기 위치 (0, 1)에서 가로 상태 (0)로 시작

        System.out.println(count);
    }

    static void movePipe(int r, int c, int d) {
        // 현재 위치가 끝 지점에 도달한 경우
        if (r == N - 1 && c == N - 1) {
            count++;
            return;
        }

        // 가로 상태 (d = 0)
        if (d == 0) {
            if (c + 1 < N && map[r][c + 1] == 0) {
                movePipe(r, c + 1, 0); // 가로로 이동
            }
            if (r + 1 < N && c + 1 < N && map[r + 1][c] == 0 && map[r][c + 1] == 0 && map[r + 1][c + 1] == 0) {
                movePipe(r + 1, c + 1, 1); // 대각선으로 이동
            }
        }

        // 세로 상태 (d = 2)
        if (d == 2) {
            if (r + 1 < N && map[r + 1][c] == 0) {
                movePipe(r + 1, c, 2); // 세로로 이동
            }
            if (r + 1 < N && c + 1 < N && map[r + 1][c] == 0 && map[r][c + 1] == 0 && map[r + 1][c + 1] == 0) {
                movePipe(r + 1, c + 1, 1); // 대각선으로 이동
            }
        }

        // 대각선 상태 (d = 1)
        if (d == 1) {
            if (c + 1 < N && map[r][c + 1] == 0) {
                movePipe(r, c + 1, 0); // 가로로 이동
            }
            if (r + 1 < N && map[r + 1][c] == 0) {
                movePipe(r + 1, c, 2); // 세로로 이동
            }
            if (r + 1 < N && c + 1 < N && map[r + 1][c] == 0 && map[r][c + 1] == 0 && map[r + 1][c + 1] == 0) {
                movePipe(r + 1, c + 1, 1); // 대각선으로 이동
            }
        }
    }
}
