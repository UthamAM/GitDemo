import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLearn {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("My");
		a.add("Name");
		a.add("is");
		a.add("Utham");
		System.out.println(a.get(3));

		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		for(String val  :a) {
			System.out.println(val);
		}
		System.out.println(a.contains("Utham"));
		
		String[] b = {"a","b","c", "d"};
		List <String> arr=Arrays.asList(b);
		
		System.out.println(arr.contains("b"));
		
	}

}
