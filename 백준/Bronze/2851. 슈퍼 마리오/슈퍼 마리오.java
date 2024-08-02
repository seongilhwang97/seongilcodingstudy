import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		int target = 100;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if(sum1+arr[i]<target) {
				sum1+=arr[i];
			} else {
				sum2 = sum1+arr[i];
				break;
			}
		}
		int result = (Math.abs(target-sum1) >= Math.abs(target-sum2)) ? sum2 : sum1;
		System.out.println(result);
	}

}
