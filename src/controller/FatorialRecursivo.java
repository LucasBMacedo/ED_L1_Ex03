package controller;

public class FatorialRecursivo {

	public FatorialRecursivo() {
		super ();
	}
	public int fatorialRecursivo(int n) {
		if (n < 1) {
			return 1;
		}
		else {
			return n * fatorialRecursivo(n - 1);
		}
	}
}