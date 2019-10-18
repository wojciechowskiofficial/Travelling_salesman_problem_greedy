package com.company;

import java.util.ArrayList;

public class Greedy {
    public Greedy(ArrayList<Vertex> inputInstance) {
        this.inputInstance = new ArrayList<Vertex>(inputInstance);
        this.initialSize = inputInstance.size();
        this.computer = new Compute();
    }

    private ArrayList<Vertex> inputInstance;
    private int initialSize;
    private Compute computer;

    public int [] solveGreedy() {
        int [] output = new int [this.initialSize];
        Vertex tmp = this.inputInstance.get(0);
        output[0] = tmp.id + 1;
        this.inputInstance.remove(0);
        int nextId = 0;
        for(int i = 1; i < this.initialSize; i++) {
            nextId = this.computer.minDistVertex(tmp.getPos(), this.inputInstance);
            output[i] = this.inputInstance.get(nextId).id + 1;
            tmp = this.inputInstance.get(nextId);
            this.inputInstance.remove(nextId);
        }

        return output;
    }

}
