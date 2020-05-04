package no.hvl.dat109;

public class Terning {
	int MAX = 6;
	int verdi;
	
	public Terning() {
	}

	public int trill() {
		verdi = (int) (Math.random() * MAX) + 1;
		return verdi;
	}
}
