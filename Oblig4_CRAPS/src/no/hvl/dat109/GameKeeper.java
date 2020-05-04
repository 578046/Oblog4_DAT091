package no.hvl.dat109;

public class GameKeeper {

	private Terning t1;
	private Terning t2;
	private TerningKopp terninger = new TerningKopp(t1, t2);
	int score = terninger.trill();
	int forrigeScore = 0;
	int antall = 0;
	boolean vunnet = false;

	public void spill() {

		while (!vunnet) {
			antall++;
			if (antall == 1) {
				System.out.println("First score = " + score);

				if (score == 7 || score == 11) {
					System.out.println("Du vinner med score " + score);
					vunnet = true;
					break;
				} else if (score == 2 || score == 3 || score == 12) {
					System.out.println("Du tapte med score " + score + "...");
					vunnet = false;
					break;
				}
			} else if (antall > 1) {
				forrigeScore = score;
				score = terninger.trill();
				System.out.println("Score = " + score);

				if (score == forrigeScore) {
					System.out.println("Du vinner!");
					vunnet = true;
					break;
				} else if (score == 7) {
					System.out.println("Tapte med 7");
					vunnet = false;
					break;
				} else {
					System.out.println("Trill på nytt");
					System.out.println("Ny score = " + score);
				}
			}
		}
	}
}
