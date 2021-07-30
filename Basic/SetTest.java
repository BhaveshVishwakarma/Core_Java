package com.neosoft.basics;
import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		
		System.out.println("\t\tHashSet Example\n");
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,6,9,0}));
		
		Set<Integer> set2=new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,4,5,6,7,5}));
		
		Set<Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println("Union : "+union);
		
		Set<Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println("Intersection : "+intersection);
		
		Set<Integer> difference=new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println("Difference : "+difference);
		
		System.out.println("2 is there ? : "+difference.contains(2));
		System.out.println("Remove 0 : "+difference.remove(0));
		
		for(Integer i:difference)
			System.out.print("Element : "+i+", ");
		
		System.out.println("\nWith Iterator");
		Iterator<Integer> itr=difference.iterator();
		while(itr.hasNext())
			System.out.print("Element : "+itr.next()+", ");
		
		System.out.println();
		
		System.out.println("\n\t\tLinkedHashSet Example\n");
		
		Set <String> lhs = new LinkedHashSet<String>();  
		lhs.add("Bhavesh");
		lhs.add("Rakesh"); 
		lhs.add("Anand");
		lhs.add("Sandeep");
		lhs.add("Satish");
		
		System.out.print("Element : "+lhs);
		
		lhs.remove("Sandeep");
		System.out.print("\nElement : "+lhs);
		
		System.out.println();
		System.out.println("\n\t\tTreeSet Example\n");
		Set <String> ts = new TreeSet<String>(); 
		ts.add("Bhavesh");
		ts.add("Rakesh"); 
		ts.add("Anand");
		ts.add("Sandeep");
		ts.add("Satish");
		
		System.out.print("Element : "+ts);
		
		ts.remove("Satish");
		System.out.print("\nElement : "+ts);
	}

}
