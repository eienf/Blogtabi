public class Reader {
	public Reader() {}
	public void notifyNewEntry(IBlog blog) { blog.writeComment(this.readBlog()); }
	public int readBlog() { return (int)(Math.random() * 9000 + 1000); }

	public static void main(String argv[]) {
		Reader r = new Reader();
		for ( int i = 0; i < 5; i++ ) {
			System.out.println("comment = "+r.readBlog());
		}
	}
};
