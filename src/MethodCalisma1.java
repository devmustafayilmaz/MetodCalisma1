
public class MethodCalisma1 {

	public static void main(String[] args) {
		DikUcgenCiz(20);
		NormalUcgenCiz(20);
	}
	public static void DikUcgenCiz(int boyut) {
		
		for(int i = 1 ; i<boyut; i ++) {
			
			for(int k=1; k<i;k++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	public static void NormalUcgenCiz(int boyut) {
		
		for(int i = 1 ; i<boyut; i ++) {
			
			for(int x= boyut; x>i; x --) {
				
				System.out.print(" ");
			}
			
			for(int k=1; k<i;k++) {
				System.out.print("*");
			}
			for(int k=1; k<i;k++) 
			{
				System.out.print("*");
			}
			
			System.out.println();

			
		}
		
	}

}
