package labb_1;

public class labb_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for ( int i = 1 ; i <= 100 ; i++) {
			if (i == 42) {
				System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
			} else if (i % 3 == 0 && i % 5 != 0) {
				System.out.println("Fizz");
			} else if (i % 3 != 0 && i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Fizzbuzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
