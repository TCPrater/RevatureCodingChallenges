package projectOnboarding;

import java.util.ArrayList;
import java.util.List;

public class October17_2022 {
	private int highest = 0;
	private List<Integer> FakeStack = new ArrayList<>(); 
	public static int listOverlap(List<Integer> A, List<Integer> B)
	{
		int result = -1; 
		for (int i=0;i<A.size();i++)
		{
			for (int j=0;j<B.size();j++)
			{
				if (A.get(i)==B.get(j)) {result = A.get(i);}
			}
		}
		return result; 
	}
	
	public void fakePush(int n) 
	{
		FakeStack.add(n); 
		if (FakeStack.size()==1) {highest = n;}
		else {if (highest<n) {highest = n;}}
	}
	
	public int fakePop() throws IndexOutOfBoundsException
	{
		if (FakeStack.size()==0) {throw new IndexOutOfBoundsException("Empty Stack");}
		int temp = FakeStack.get(FakeStack.size()-1);
		FakeStack.remove(FakeStack.size()-1);
		return temp;
	}
	
	public int getHighest() {return highest;}
	
	public static void main(String args[])
	{
		List<Integer> A = new ArrayList<>();
		List<Integer> B = new ArrayList<>(); 
		for (int i=1;i<15;i++) {A.add(i); B.add(3*i);}
		System.out.println(listOverlap(A,B));
		
		October17_2022 C = new October17_2022();
		C.fakePush(1);
		C.fakePush(6);
		C.fakePush(12);
		C.fakePush(19);
		C.fakePush(7);
		
		System.out.println(C.fakePop()+" "+C.getHighest());
	}
}
