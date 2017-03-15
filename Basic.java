package AddSub;

public class Basic {

		public static void main(String arg[]) {
			int n1=30;
			int n2=20;
			int max=car(n1, n2);
			System.out.println(max);
			int n3=Add(n1, n2);
			System.out.println(n3);
			int n4 = n1-n2;
			System.out.println(n4);
			int n5 = n1*n2;
			System.out.println(n5);
	
			
		}
		public static int car(int n1, int n2) {
			   int max;
			   if (n1 < n2)
			      max = n1;
			   else
			      max = n2;

			   return max;    
		}
		public static int Add(int n1, int n2){
			int n3=n1+n2;
			return n3;
			}
		
	 void div(int n1, int n2){
			double n6 = n1/n2;
			System.out.println(n6);
			
		}
}

