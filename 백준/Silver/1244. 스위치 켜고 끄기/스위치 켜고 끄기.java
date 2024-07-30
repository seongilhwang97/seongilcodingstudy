import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 스위치 개수 받기
		int N = sc.nextInt();
		// 스위치 개수 배열 생성 후 입력
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		// 학생 수 받기
		int Student = sc.nextInt();
		// 학생 받은 만큼 반복
		for (int i = 0; i < Student; i++) {
			// 성별 판별
			int gender = sc.nextInt();
			// 스위치번호 판별
			int switchnum = sc.nextInt();
			// 남자일 때
			if (gender == 1) {
				// 배열 전체 순회
				for (int j = 0; j < arr.length; j++) {
					// 스위치 번호 1부터 시작하니 +1
					// 스위치번호로 나눴을 때 나머지가 0이면 배수
					if ((j + 1) % switchnum == 0) {
						// 인덱스 값이 배수이고, 값이 0 이면 1로 변경
						if (arr[j] == 0) {
							arr[j] = 1;
						}// 인덱스 값이 배수이고, 값이 1이면 0으로 변경 
						else if (arr[j] == 1) {
							arr[j] = 0;
						}
					}
				}
				// 여자일 때
			} else if (gender == 2) {
				// 카운트는 좌우 대칭인 횟수
				int count = 0;
				// 스위치번호 - 1 = 실제 인덱스 번호
				// j가 0이면 좌우비교가 안되니 1부터 시작
				// 인덱스 값인 (switchnum-1-j)와 (switchnum-1+j)가 0부터 배열 길이 안에 들어오도록 설
				for (int j = 1; switchnum - 1 - j >= 0 && switchnum - 1 + j < arr.length; j++) {
					// 좌변과 우변 인덱스에 같은 값을 더하고, 빼서 좌우 값 비교
					if (arr[switchnum - 1 - j] != arr[switchnum - 1 + j]) {
						break;
					} else {
						// 값이 같으면 카운트 증가
						count++;
					}
				}
				// 선택된 스위치 값은 무조건 바뀌므로 0일때 1, 1일 때 0으로 변
				if (arr[switchnum - 1] == 0) {
					arr[switchnum - 1] = 1;
				} else if (arr[switchnum - 1] == 1) {
					arr[switchnum - 1] = 0;
				}
				// 0부터 시작하면 선택된 스위치 값 바뀌니까 j는 1부터 시작
				// 카운트 갯수까지 반복
				// 우변을 카운트 갯수만큼 확대해나가며 수정
				for (int j = 1; j <= count; j++) {
					if (arr[switchnum - 1 + j] == 0) {
						arr[switchnum - 1 + j] = 1;
					} else if (arr[switchnum - 1 + j] == 1) {
						arr[switchnum - 1 + j] = 0;
					}
				}
				// 좌변을 카운트 갯수만큼 확대해나가며 수정
				for (int j2 = 1; j2 <= count; j2++) {
					if (arr[switchnum - 1 - j2] == 0) {
						arr[switchnum - 1 - j2] = 1;
					} else if (arr[switchnum - 1 - j2] == 1) {
						arr[switchnum - 1 - j2] = 0;
					}
				}
			}
		}
		// 만약 20개 넘게 출력될 때마다 한 줄 띄
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if ((i + 1) % 20 == 0) {
				System.out.println();
			}
		}
	}
}
