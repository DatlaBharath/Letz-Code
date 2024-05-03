public class functions {

	void nonstatic() {
		System.out.println("hello");
	}

	static int fib(int i) {
		// 1 1 2 3 5....
		if (i <= 2) {
			return 1;
		} else {
			return fib(i-1)+fib(i-2);
		}
	}
	public static void main(String[] args) {
		functions fp = new functions();
		fp.nonstatic();

		for(int i=1; i<=4; i++) {
			System.out.print(fib(i));
			System.out.print(" ");
		}

	}
}
