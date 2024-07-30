import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트 케이스 10개 받기
		for (int i = 0; i < 10; i++) {
			// 입력값 받기
			int N = sc.nextInt();
			// 입력값에 따른 배열 생성
			int[] array = new int[N];
			// 입력값만큼 높이 입력받아 배열에 삽입
			for (int j = 0; j < N; j++) {
				array[j] = sc.nextInt();
			}
			// 조망권 확보된 곳
			int count = 0;
			
			// 높이 비교 담아둘 배열 생성
			int[] list = new int[5];
			// 높이 비교 담아둘 인덱스
			int idx = 0;
			// 양쪽 끝은 00이니까 (2부터~길이-2)까지
			for (int j = 2; j < array.length-2; j++) {
				int Max = array[j];
				// 0층나오는 곳부터 비교
				for (int j2 = j-2; j2 <= j+2; j2++) {
					list[idx] = array[j2];
					idx++;
					}
				idx = 0;
				Arrays.sort(list);
				if(Max > list[3]) {
					count+=Max-list[3];
				}
			}
			System.out.println("#"+(i+1)+" "+count);
		}
	}
}
