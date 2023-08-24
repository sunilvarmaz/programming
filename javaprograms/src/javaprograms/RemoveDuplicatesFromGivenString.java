package javaprograms;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromGivenString {
	public static void main(String[] args) {
		String s = "Rahul my name is Rahul";
		String[]s1 = s.split(" ");
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		for(String x:s1) {
			h.add(x);
		}
		Iterator i = h.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}

}
