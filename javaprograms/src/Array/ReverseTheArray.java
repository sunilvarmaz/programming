package Array;

public class ReverseTheArray {
	public static void main(String[] args) {
		int a[] = new int[]{1,2,3,4,5,6,7};
		System.out.println("orginal value");
		
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i]+"");
			
		}
		System.out.println();
		System.out.println("array in reverse order");
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i]+"");
		}
		
	}

}
