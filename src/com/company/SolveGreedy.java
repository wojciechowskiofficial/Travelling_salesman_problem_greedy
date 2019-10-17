package com.company;

import java.util.ArrayList;
import java.util.Random;

public class SolveGreedy {
    public SolveGreedy(ArrayList<Vertex> inputInstance) {
        this.inputInstance = inputInstance;
    }

    private ArrayList<Vertex> inputInstance;
    private int instanceSize;
    public ArrayList<Integer> solutionSequence;

    public void solveGreedy() {
        this.instanceSize = this.inputInstance.size();
        Vertex current = this.inputInstance.get(new Random().nextInt(this.instanceSize));
        current.displayPos();
    }
}
