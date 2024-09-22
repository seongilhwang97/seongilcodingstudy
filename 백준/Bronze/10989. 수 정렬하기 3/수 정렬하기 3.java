import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] count = new int[10001];
		for (int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}
		for (int i = 1; i < count.length; i++) {
			while(count[i]>0) {
				bw.write(i+"\n");
				count[i]--;
			}
		}
		bw.flush();

	}
}


