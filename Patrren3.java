package akhil;

public class Patrren3 {

	public static void main(String[] args) {
		/* 5 4 3 2 1
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1
		 * 1
		 * 
		 */
		for(int r =5;r>=1;r--) {
			for(int c =r;c>=1;c--) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	

	}

}
