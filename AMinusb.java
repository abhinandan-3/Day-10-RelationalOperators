package day10;

public class AMinusb {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int[] b = {100,200,1,2,4,300,400};
		// A - B---- 3 5 6
		int[] aminusb = new int[a.length];
		
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(checkDuplicate(b,a[i])== false) {
				aminusb[index++] = a[i];	
			}//if
		}// for
		System.out.println("A array elements");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n B array elements");
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n A-B array elements");
		// print a-b
		for(int i=0;i<index;i++) {
			System.out.print(aminusb[i]+" ");
		}
	}
	private static boolean checkDuplicate(int[] aub, int bv) {
		
		for(int i=0;i<aub.length;i++) {
			if(aub[i] == bv) return true;
		}
		
		return false;
	}

}