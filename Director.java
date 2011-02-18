public class Director {
	private boolean preZero = false;
	public Director() {}
	public int fund(int number,int dice) {
		int result = 0;
		switch ( dice ) {
		case 1: preZero = true; return 0;
		case 2:
		case 3:
			result = (int)((float)number * .1);
			break;
		case 4:
		case 5:
			result = number * 1;
			break;
		case 6:
			result = number * 10;
			break;
		default: return 0;
		}
		preZero = false;
		return result;
	}

	public static void main(String argv[]) {
		Director he = new Director();
		int comment, dice;
		comment = 1000;
		for ( dice = 1; dice <= 6; dice++ ) {
			System.out.println("("+comment+", "+dice+") = "+he.fund(comment,dice));
		}
	}
};
