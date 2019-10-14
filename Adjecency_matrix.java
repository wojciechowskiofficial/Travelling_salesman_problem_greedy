public class Adjecency_matrix {
	public Adjecency_matrix(int instance_nr) {
		this.instance_nr = instance_nr;
		graph = new Vertex [this.instance_nr][this.instance_nr];
		for (int i = 0; i < this.instance_nr; i++) {
			for (int j = 0; j < this.instance_nr; j++) {
				this.graph[i][j] = new Vertex();
			}
		}
	}
	public int instance_nr;
	public Vertex [][] graph;
}
