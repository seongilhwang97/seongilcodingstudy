import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ninedwarf = new int[9];
		for (int i = 0; i < 9; i++) {
			ninedwarf[i] = sc.nextInt();
		}
		Arrays.sort(ninedwarf);
		out: for (int i = 0; i < ninedwarf.length; i++) {
			for (int j = 0; j < ninedwarf.length; j++) {
				if(i!=j) {
					int tmp1 = ninedwarf[i];
					int tmp2 = ninedwarf[j];
					ninedwarf[i] = 0;
					ninedwarf[j] = 0;
					int sum = 0;
					for (int k = 0; k < ninedwarf.length; k++) {
						sum += ninedwarf[k];
					}
					if (sum == 100) {
						for (int k = 0; k < ninedwarf.length; k++) {
							if(ninedwarf[k]!=0) {
								System.out.println(ninedwarf[k]);
							}
						}
						break out;
					}
					ninedwarf[i] = tmp1;
					ninedwarf[j] = tmp2;
				}
			}
		}
	}
	/*
	 *후보리스트 9개 받기
	 *정렬시키기
	 *for문 두 개 돌리기
	 *for (i~
	 *	for(j)
	 *		
	 */

}
