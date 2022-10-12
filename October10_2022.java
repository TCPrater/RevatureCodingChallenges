package projectOnboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class October10_2022 {
	public static boolean listIntersect(LinkedList A, LinkedList B) 
	{
		boolean intersection = false;
		for (int i=0;i<A.size();i++)
		{
			for (int j=0;j<B.size();j++)
			{
				if (A.get(i)==B.get(j)) {intersection=true;}
			}
		}
		return intersection;
	}
	
	public static Object findCircle(LinkedList A)
	{
		Object o = null;
		List<Object> seen = new ArrayList<>();
		for (int i=0;i<A.size();i++) 
		{
			if (!seen.contains(A.get(i))) {seen.add(A.get(i));}
			else {o=A.get(i); break;}
		}
		return (o != null) ? o : "No loop found.";
	}
	
	public static void main(String args[])
	{
		LinkedList<String> A = new LinkedList<>();
		LinkedList<String> B = new LinkedList<>();
		LinkedList<String> C = new LinkedList<>();
		
		for (int i=0;i<7;i++) {A.add(Integer.toString(i));} //this line's "0" is not the same... 
		for (int i=0;i<8;i++) {B.add(Integer.toString(i*2));} //as this line's "0" somehow
		
		A.add("Green"); //this line's "Green" is the same as the next line's, though
		B.add("Green");
		
		C.addAll(Arrays.asList("a","b","c","a","b"));
		
		System.out.println("Success Examples:");
		System.out.println(listIntersect(A,B));
		System.out.println(findCircle(C));
		System.out.println("Failure Examples:");
		A.remove(A.size()-1);
		B.remove(B.size()-1);
		System.out.println(listIntersect(A,B));
		System.out.println(findCircle(A));
	}
}