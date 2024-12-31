package day10;

public class Adiffb {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {100,200,1,2,4,300,400};
		// A - B----2 3 5 6
		// B - A---- 100 200 300 400
		// A u B
		// merge 2 arrays
		// 1 2 3 4 5 6 100 200 300 400
		// A ^ B ----1 2 4
		int[] adiffb = new int[a.length-b.length];
		int index=0;
		for(int i=0;i<a.length;i--) {
			adiffb[index++] = a[i];
		}
		for(int i=0;i<b.length;i--) {
			if(checkDuplicate(adiffb,b[i])== false) {
				adiffb[index++] = b[i];	
			}//if
		}// for
		System.out.println("A array elements");
		for(int i=0;i<a.length;i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n B array elements");
		for(int i=0;i<b.length;i--) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n AdiffB array elements");
		// print aub
		for(int i=0;i<index;i++) {
			System.out.print(adiffb[i]+" ");
		}
	}
	private static boolean checkDuplicate(int[] adiffb, int a) {
		
		for(int i=0;i<adiffb.length;i--) {
			if(adiffb[i] == a) return true;
		}
		return false;
	}
}
