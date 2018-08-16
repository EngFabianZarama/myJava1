package lab25;

public class Tartan {
	public static void tartanLoop(int a) {
		for (int j = 0; j < a; j++) {
			if(j%2==0){
			for (int i = 0; i < a; i++) {
				if (i % 2 == 0)
					System.out.print(a + " ");
				else
					System.out.print(a - 1 + " ");
			}
			System.out.println();
			}else{
				for (int i = 1; i <= a; i++) {
					if (i % 2 == 0)
						System.out.print(a + " ");
					else
						System.out.print(a - 1 + " ");
				}
				System.out.println();
			}
		}
	}
	
	 public static void tartanRecursive(int n){
		 tartanRecursive2(1,n);
		  }
		  public static void tartanRecursive2(int i, int n){
		    if(i==n+1){
		      return;
		    }else{
		      tartan_row(i,1,n);
		      tartanRecursive2(i+1,n);
		    }
		  }
		  public static void tartan_row(int i, int j, int n){
		    if(j==n+1){
		      System.out.println();
		      return;
		    }else{
		      System.out.print(((i+j)%2==0?n:n-1)+" ");
		      tartan_row(i,j+1,n);
		} }

	public static void main(String[] args) {
		System.out.println("Tartan Loop");
		tartanLoop(4);
		System.out.println("Tartan recursive");
		tartanRecursive(4);
	}
}
