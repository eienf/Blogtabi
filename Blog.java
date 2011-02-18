public class Blog implements IBlog {
	protected int comment;
	protected Reader reader;
	public Blog() { reader = new Reader(); }
	public void writeBlog() {
		comment = 0;
		reader.notifyNewEntry(this);
	}
	public void writeComment(int number) { comment = number; }
	public int readComment() { return comment; }
};
