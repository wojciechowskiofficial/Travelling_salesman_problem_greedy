package com.company;

public class AdjecencyMatrix {

    public AdjecencyMatrix(int instanceNr) {
        this.instanceNr = instanceNr;
        graph = new Vertex [this.instanceNr][this.instanceNr];
        for (int i = 0; i < this.instanceNr; i++) {
            for (int j = 0; j < this.instanceNr; j++) {
                this.graph[i][j] = new Vertex();
            }
        }
    }

    public int instanceNr;
    public Vertex [][] graph;
}
