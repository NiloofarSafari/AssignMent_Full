package assignmentoct9;

public class Increment_operation {

	public static void main(String[] args) {
		
		
		int i = 1;
		
		System.out.println(i);
		
		int j = ++i - --i;
		
		System.out.println(j);
		
		int k = j-- - --i + i-- - --j;
		
		System.out.println(k);
		
		int l = --k - k-- + i-- - --i + j++ - --j;
		
		System.out.println(l);
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
		// my answer on the paper are: 
		// i=1
		//j=1
		//k=1-0
		//l=3
		
				

	}

}
