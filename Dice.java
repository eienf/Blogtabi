import java.util.Random;

public class Dice {
	public int no;
	public final int max = 6;
	private Random r;
	public Dice() { r = new Random(System.currentTimeMillis()); }
	public int roll() {
		return 1 + r.nextInt(max);
	}

	public static void main(String argv[]) {
		Dice dice = new Dice();
//		System.out.println("dice = "+dice.roll());
		int result[] = new int[6];
		for ( int i = 0; i < 10000; i++ ) {
			result[dice.roll()-1]++;
		}
		for ( int i = 0; i < 6; i++ ) {
			System.out.println(i+" "+result[i]);
		}
	}
};
