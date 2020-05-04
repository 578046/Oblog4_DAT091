package no.hvl.dat109;

public class TerningKopp {
	Terning t1 = new Terning();
	Terning t2 = new Terning();
	
	public TerningKopp(Terning t1, Terning t2) {
		this.t1 = new Terning();
		this.t2 = new Terning();
	}

	public int trill() {
		return t1.trill() + t2.trill();
	}
}
