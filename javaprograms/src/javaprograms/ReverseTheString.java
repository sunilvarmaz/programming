package javaprograms;

public class ReverseTheString {
	public static void main(String[] args) {
		String s = "sunil kumar raju";
        String reverse = "";
        int lenght  = s.length();
        for(int i = 0;i<s.length();i++) {
        	reverse = s.charAt(i)+ reverse;
        	
        }
        System.out.println(reverse);
		
	}

}
