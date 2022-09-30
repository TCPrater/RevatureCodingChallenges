package projectOnboarding;

import java.util.ArrayList;
import java.util.List;

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
	public static void main(String args[])
	{
		int[] A = {5, 8, 2, 13, 2, 9}; //hard-coding this for now
		int[] B = sortArray(A.length, A);
		for (int i=0;i<B.length;i++) {System.out.println(B[i]);}
	}
}
