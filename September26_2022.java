package projectOnboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class September26_2022 {
	public static int[] sortArray(int N, int[] A)
	{
		int indexH;
		int[] B = new int[N];
		List<Integer> indicesUsed = new ArrayList<>();
		
		for (int i=N;i>0;i--)
		{
			indexH = 0;
			while (indicesUsed.contains(indexH)) {indexH++;}
			
			for (int j=0;j<N;j++) {if (!indicesUsed.contains(j) && A[indexH]<A[j]) {indexH=j;}}
			
			B[i-1] = A[indexH]; 
			indicesUsed.add(indexH);
		}
		
		return B;
	}

	public static int largestGap (int N, int[] A)
	{
		int gap = 0;
		int[] B = sortArray(N,A);
		for (int i=0;i<N-1;i++) {if ((B[i+1]-B[i])>gap) gap=B[i+1]-B[i];}
		
		return gap;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0;i<N;i++) {A[i]=sc.nextInt();}
		sc.close();
		
		System.out.println(largestGap(N,A));
	}
}
