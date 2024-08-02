import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < arr.length; j2++) {
					if((i!=j)&&(j!=j2)&&(i!=j2)) {
						if ((M - (arr[i] + arr[j] + arr[j2]) >=0)&&
								(arr[i] + arr[j] + arr[j2]) > max){
							max = arr[i] + arr[j] + arr[j2];
//							System.out.println("arr[i]="+arr[i] +" arr[j] = "+arr[j]+" arr[j2]="+arr[j2]);
						}
					}
				}
			}
		}
		System.out.println(max);
		
	}

}
