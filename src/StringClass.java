
public class StringClass {

	public static void main(String[] args) {
		
		String s ="Hello world welcome";
		String s2 ="Welcome";
		String [] spts = s.split(" ");
		
		System.out.println(spts[0]);
		System.out.println(spts[1].trim());
	
		for(int i=s2.length()-1 ; i>=0; i--){
		    System.out.println(s2.charAt(i));
		}
		

	}

}
