package Array;
//sum of elements present in array;
public class sumofelements {
	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = '2';
		a[1] = '3';
		a[2] = '5';
		a[3] = '6';
		int sum = 0;
		for(int i = 1;i<a.length;i++) {
			 sum = sum +a[i];
		}
		System.out.println(sum);
		
	}

}
