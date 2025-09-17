
public class Javabasic {

	public static void main(String[] args) {
//		int a =10;
//		int b =5;

//		int temp =a;
//		a=b;
//		b=temp;
//		System.out.println(a);
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]%2==0){
				System.out.println(arr[i]+ "is EVEN"); 
			}
			else {
				System.out.println(arr[i]+" "+  "is ODD");
			}
		}
		
		System.out.println("Code change1");
		System.out.println("Code change2");
		System.out.println("Code change3");
		System.out.println("Code gitchange4");
		System.out.println("Code gitchange5");

	}

}
