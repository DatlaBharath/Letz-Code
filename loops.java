import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		// for
		// *
		// **
		// ***
		// ****
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//    *
		//   ***
		//  *****
		// *******
		for(int i=0;i<r;i++) {
			for(int j=0;j<=r-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *
		for(int i=0;i<r-1;i++) {
			for(int j=0;j<r-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=r-i;j>0;j--) {
				System.out.print("*");
			}
			for(int j=r-i-1;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		// while
		int itr = sc.nextInt();
		int Sum = 0;
		while (itr!=0){
			Sum += sc.nextInt();
			itr--;
		}
		System.out.println(Sum);
		System.out.println("-----------------");

		// do while
		int[] arr = {1,2,3,4,5};
		int count = 1;
		int max1 = arr[0];
		int max2 = arr[0];
		do {
			if (max2 < arr[count]) {
				if (max1 < arr[count]) {
					max2 = max1;
					max1 = arr[count];
				} else {
					max2 = arr[count];
				}
			}
			count++;
		} while(count < arr.length);
		System.out.println(max2);
		System.out.println("-----------------");

		// for each
		String[] names = {"Barath", "Partha", "Ravi", "Vinay", "Akash"};
		for (String name : names) {
			System.out.println(name);
		}
		sc.close();

	}
}
