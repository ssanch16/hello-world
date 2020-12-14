package computerProgramming;

public class StrictlyIncreasing {

	public static boolean isAscending (int[] a) {
		for (int i=0; i < a.length-1; i++) {
				if (a[i] > a[i+1]) {
					return false;
			}
		}
			return true;
		}
		public static void main(String[] args) {
			int[] a = {2,4,6,8,10,12,14};
			System.out.println(isAscending(a));
		}
	}
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	
