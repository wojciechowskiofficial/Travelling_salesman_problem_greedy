public class Vertex {
	public Vertex() {
		this.x_pos = -1;
		this.y_pos = -1;
	}
	public int [] get_pos() {
		return new int [] {this.x_pos, this.y_pos};
	}
	public void set_pos(int x, int y) {
		this.x_pos = x;
		this.y_pos = y;
	}
	public void display_pos() {
		System.out.print(this.x_pos + " " + this.y_pos);
	}
	private int x_pos, y_pos;
}
