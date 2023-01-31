
public class DS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Biggest(2,3);
		System.out.println("Larger of two numbers is: "+a);
		
		Swap(2,3);
		Swap_without3(2,3);
		System.out.println(even(29));
		System.out.println(compare3(2,1,5));
		System.out.println(vovel('e'));
		max();
		System.out.println(string("abc","vacd"));
		
		

	}
	
	
	public static int Biggest(int a, int  b) {
		if(a>b) {
			return a;
		}
		return b;
	}
	
	public static void Swap(int a, int b) {
		int c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swap are: "+a+", "+b);
	}
	
	public static void Swap_without3(int a, int b) {
		a= a*b;
		b=a/b;
		a=a/b;
		System.out.println("Numbers after swap are: "+a+", "+b);
		
	}
	
	public static boolean even(int a) {
		return a%2==0?true:false;
	}
	
	
	public static int compare3(int a, int b, int c) {
		if(a>b &a>c) {
			return a;
		}else if(b>a &b>c) {
			return b;
		}
		else {
			return c;
		}
	}
	
	public static boolean vovel(char a) {
		char[] ar = new char[] {'a','i','o','e','u'};
		for(int i=0;i<ar.length;i++) {
			if(a==ar[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static void max() {
		int[] arr= new int[] {1,2,3,4,5,6,7};
		int max =0;
		int max2=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println("Max element is:"+ max);
		for(int i=0;i<arr.length;i++) {
			if(max2<arr[i] & arr[i]!=max)
				max2=arr[i];
		}
		System.out.println("2nd max is:"+max2);
		
	}
	
	public static boolean string(String a, String b) {
		return a.contains(b) || b.contains(a) ;
		
	}

}
