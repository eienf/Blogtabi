public class Player {
	protected int money;
	protected Blog blog;
	protected Director director;
	protected Dice dice[];
	public Player() {
		blog = new Blog();
		director = new Director();
		dice = new Dice[2];
		dice[0] = new Dice(); dice[0].no = 1;
		dice[1] = new Dice(); dice[1].no = 2;
		this.money = 0;
	}
	public void halfDay() {
		blog.writeBlog();
		int comment = blog.readComment();
		int pip = dice[1].roll();
		int money = director.fund(comment,pip);
		this.money += money;
		this.log(comment,pip,money,this.money);
	}
	public void log(int comment, int dice, int money, int total) {
		System.out.println("comment = "+comment+" dice = "+dice+" money = "+money
			+" ------> "+total);
	}

	public static void main(String argv[]) {
		Player saki = new Player();
		for ( int i = 0; i < 10; i++ ) {
			saki.halfDay();
		}
	}
};
